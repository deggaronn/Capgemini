const jwt = require('jsonwebtoken');


//Used to jwt check token and guard pages
const requireAuth = (req, res, next)=>{

    if(!req.headers.authorization){
        return res.status(401).send("Unauthorized Request")
    }
    let token = req.headers.authorization.split(' ')[1];
    if(token === 'null'){
        return res.status(401).send("Unauthorized Request")
    }
    let payload = jwt.verify(token,'A strong secret token')
    if(!payload){
        return res.status(401).send("Unauthorized Request")
    }
    req.userId = payload.id;
    next();



    //const token = req.cookies.jwt;
    /* //Check if JWT cookie exists and is valid
    if(token){
        jwt.verify(token,'A strong secret token',(err, decodedToken)=>{
            if(err){
                console.log(err.message);
                //redirect to login maybe
            }else{
                console.log(decodedToken);
                next();
            }
        });
    }
    else{
        res.redirect('/api/login');
    } */

};

module.exports ={ requireAuth }; 
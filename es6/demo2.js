var firsname = 'abhishek';
var lastname = 'bondwal';
var person = {
    firsname,
    lastname
};
function createPerson(firsname, lastname, age){
    let fullname = firsname +" "+ lastname
    return {fullname,
    isSenior(){
        return age>60
    }}
}
let p=createPerson('abhishek','bondwal',22)

console.log(p.isSenior())
//console.log(person.firsname +' '+ person.lastname);

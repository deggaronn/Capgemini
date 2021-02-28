var disp = function (message,...colours) {
    console.log(message)
    console.log(colours)
    for (var i in colours) {
        console.log(colours[i]);
    }
};
let message="list of colours"
let colourArray = ['red','yellow','orange']
disp(message, ...colourArray)
disp(message,'red');
disp(message,'red','blue')
disp(message, 'red','green','blue')

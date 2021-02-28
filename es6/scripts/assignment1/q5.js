"use strict";
var __spreadArray = (this && this.__spreadArray) || function (to, from) {
    for (var i = 0, il = from.length, j = to.length; i < il; i++, j++)
        to[j] = from[i];
    return to;
};
var q5 = function (name1) {
    var usrar = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        usrar[_i - 1] = arguments[_i];
    }
    console.log(name1);
    console.log(arrayOfUsers);
    for (var i in usrar) {
        console.log(usrar[i]);
    }
};
var name1 = "abhishek";
var arrayOfUsers = ['ashok', 'lachhman', 'rishika'];
q5.apply(void 0, __spreadArray([name1], arrayOfUsers));
//# sourceMappingURL=q5.js.map
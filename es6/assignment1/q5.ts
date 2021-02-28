let q5 = (name1, ...usrar) => {
    console.log(name1)
    console.log(arrayOfUsers)
    for (let i in usrar) {
        console.log(usrar[i])
    }
}
let name1 ="abhishek"
let arrayOfUsers = ['ashok', 'lachhman', 'rishika']
q5(name1,...arrayOfUsers)

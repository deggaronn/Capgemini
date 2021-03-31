import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }
  // tslint:disable-next-line:typedef
  getEmployees(){
    return [
    {id: 1 , name: 'abhishek',  age: 23},
    {id: 2, name: 'bondwal',  age: 24},
    {id: 3 , name: 'rahul',  age: 25},
    {id: 4 , name: 'rohit',  age: 26},
    {id: 5 , name: 'kavya',  age: 27},

  ];
  }
}

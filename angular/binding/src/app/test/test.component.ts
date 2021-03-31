import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `<div>{{name}}</div> {{getUrl}}
  <p [class.text-danger]="hasError">
    i am the danger
</p>
<div [ngClass]="messageClasses">
  {{name}}
</div>
<div [style.color]="hasError ? 'red' : 'green'"> hello {{name}}</div>
<div [style.background-color]="stylBind"> style binding</div>
<button (click) = "onclick($event)"> click me to check the event</button>
<button (click) = "greeting='welcome abhishek'"> click me to print greet </button>
{{greeting}}
<input #myLog type="text">
<button (click)='logValue(myLog.value)'>click me to print value of input in comsole</button>
<button (click)='logValue(myLog)'>click me to print input type in console</button>
<input type = "text" [(ngModel)]="name">
{{name}}
  `,
  styles: [`.text-danger {
    color: red;
  }
  .text-success{
    color: green;
  }
  .text-special{
    font-style: italic;
  }`]
})
export class TestComponent implements OnInit {

  name = '';
  getUrl = window.location.href;
  public hasError = true;
  public isSpecial = true;
  public messageClasses = {
    'text-success' : !this.hasError,
    'text-danger' : this.hasError,
    'text-special' : this.isSpecial
  };
  public stylBind = 'orange';
  public greeting = '';
  constructor() { }

  ngOnInit(): void {
  }
// tslint:disable-next-line:typedef
public onclick(event){
  console.log('written after click');
  this.greeting = event.type;
}
// tslint:disable-next-line:typedef
logValue(value){
  console.log(value);
}
}

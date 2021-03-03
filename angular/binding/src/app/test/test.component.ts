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

  name = 'abhishek';
  getUrl = window.location.href;
  public hasError = true;
  public isSpecial = true;
  public messageClasses = {
    'text-success' : !this.hasError,
    'text-danger' : this.hasError,
    'text-special' : this.isSpecial
  };
  constructor() { }

  ngOnInit(): void {
  }

}

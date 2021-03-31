import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  template: `
    <p *ngIf=true> Hello </p>
    <h2>
      {{ 0.25 | currency: 'INR'}}
</h2>
  `,
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  posts: any = [
  {
    title: "First",
    content: "In tincidunt nisl eget ligula.",
    loveIts: 1,
    created_at: new Date()
  },
  {
    title: "Second",
    content: "In tincidunt nisl eget ligula.",
    loveIts: 0,
    created_at: new Date()
  },
  {
    title: "Third",
    content: "In tincidunt nisl eget ligula.",
    loveIts: -1,
    created_at: new Date()
  }
  ];
}

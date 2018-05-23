import { Component } from '@angular/core';
import * as firebase from 'firebase';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	title = 'app';

	constructor() {
		var config = {
			apiKey: "AIzaSyAnngBtRvGckh2cCjtoNcP5wXksy-FmhHY",
			authDomain: "super-projet-2.firebaseapp.com",
			databaseURL: "https://super-projet-2.firebaseio.com",
			projectId: "super-projet-2",
			storageBucket: "gs://super-projet-2.appspot.com/",
			messagingSenderId: "446753639014"
		};
		firebase.initializeApp(config);
	}
}

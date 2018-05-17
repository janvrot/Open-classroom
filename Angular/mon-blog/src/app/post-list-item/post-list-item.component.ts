import { Component, Input, OnInit } from '@angular/core';

@Component({
	selector: 'app-post-list-item',
	templateUrl: './post-list-item.component.html',
	styleUrls: ['./post-list-item.component.scss']
})
export class PostListItemComponent implements OnInit {

	@Input() postTitle: string;
	@Input() postContent: string;
	@Input() postLoveIts: number;
	@Input() postCreated: Date;


	constructor() {}

	ngOnInit() {}

	addLikes() {
		this.postLoveIts++;
		console.log(this.postLoveIts);
	}

	addDislike() {
		this.postLoveIts--;
		console.log(this.postLoveIts);
	}
}

import { Component, OnInit } from '@angular/core';
import { ChatService } from '../chat/shared/chat.service';

@Component({
  selector: 'app-chat-display',
  templateUrl: './chat-display.component.html',
  styleUrls: ['./chat-display.component.css']
})
export class ChatDisplayComponent implements OnInit {

  messages: Array<any>;

  constructor(private chatService: ChatService) { }

  ngOnInit() {
    this.chatService.getAll().subscribe(data => {
      this.messages = data;
    });
  }

}

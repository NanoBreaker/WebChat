import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { ChatService } from './chat/shared/chat.service';
import { ChatDisplayComponent } from './chat-display/chat-display.component';

@NgModule({
  declarations: [
    AppComponent,
    ChatDisplayComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ChatService],
  bootstrap: [AppComponent]
})
export class AppModule { }

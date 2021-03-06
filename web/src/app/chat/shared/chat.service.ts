import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class ChatService {

  constructor(private http: HttpClient) {

  }

  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/users-messages');
  }
}

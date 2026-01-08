import { HttpClient } from '@angular/common/http';
import { Component, inject, OnInit, signal } from '@angular/core';

type User = {
  name: string;
  email: string;
};

@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App implements OnInit {
  private http = inject(HttpClient);
  protected title = 'Books Demo';
  private baseUrl = 'http://localhost:8080/api';
  protected users = signal<User[]>([]);

  ngOnInit(): void {
    this.http.get<User[]>(`${this.baseUrl}/all`).subscribe({
      next: (users) => {
        this.users.set(users);
      },
      error: (err) => {
        console.error(err);
      },
    });
  }
}

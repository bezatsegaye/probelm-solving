import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../model/student.model';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  url: string = "http://localhost:8081/api/v1/student";
  constructor(private http: HttpClient) { }

  // When you fetch data from an URL, you get just JSON. You're telling TypeScript that data is of type Product,
  // but that is just a hint for the compiler and does not make it true. that's why I used any here
  getStudent() : Observable<any> {
    return this.http.get(this.url);
  }
}

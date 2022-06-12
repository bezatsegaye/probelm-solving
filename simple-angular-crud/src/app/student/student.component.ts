import { Component, OnInit } from '@angular/core';
import { Student } from '../model/student.model';
import { StudentService } from '../services/student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  constructor(private studentService: StudentService) { }

  student: Student[];
  errorMessage: any;

  ngOnInit(): void {
    this.studentService.getStudent().subscribe((response) => {
      console.log("Sucess");
      this.student = response;
    }, (error) => {
      console.log("Failed");
      this.errorMessage = error;
    })
  }


}

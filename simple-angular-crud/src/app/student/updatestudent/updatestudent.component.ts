import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from 'src/app/model/student.model';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-updatestudent',
  templateUrl: './updatestudent.component.html',
  styleUrls: ['./updatestudent.component.css']
})
export class UpdatestudentComponent implements OnInit {

  student: Student = new Student();
  id: number = null;
  errorMessage: any;

  constructor(private route: ActivatedRoute, 
    private studentService: StudentService,
    private router: Router) { }

  ngOnInit() {
    this.id = this.route.snapshot.params['id'];

    this.route.paramMap.subscribe(params => { 
      this.id = Number(params.get('id')); 
  });
   

  //   this.route.queryParams
  //   .subscribe(params => {
  //     console.log(params); // { order: "popular" }

  //     this.id = params.id;

  //     console.log(this.id); // popular
  //   }
  // );

    if (this.id) {
    this.studentService.getStudentById(this.id).subscribe ((response) => {
      console.log(response);
      this.student = response;
    },
    (errpr)=> {
      console.log(errpr);
      this.errorMessage = errpr;
    })
  }
  }

  onClickSave() {
    if (this.id) {
      console.log(this.student);
      this.studentService.updateStudent(this.student).subscribe(response => {
        console.log(response);
      }, error => {
        console.log(error)
      })
    } else { 
    this.studentService
    .saveStudent(this.student).subscribe(data => {
      console.log(data)
    }, 
    error => console.log(error));
  }
  }

  onBack(): void {
    this.router.navigate(['']);
  }

}
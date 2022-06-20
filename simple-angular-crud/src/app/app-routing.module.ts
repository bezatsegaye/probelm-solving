import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { UpdatestudentComponent } from './student/updatestudent/updatestudent.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [
  { path: '', component: StudentComponent },
  { path: 'add', component: UpdatestudentComponent },
  { path: 'add/:id', component: UpdatestudentComponent },
];

@NgModule({
  declarations: [],
  
  // The forRoot static method is the method that configures the root routing module for your app.
  // When you call RouterModule.
  // forRoot(routes), you are asking Angular to instantiate an instance of the Router class globally.
  imports: [ RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

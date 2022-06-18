import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { UpdatestudentComponent } from './student/updatestudent/updatestudent.component';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    UpdatestudentComponent
  ],
  imports: [
    HttpClientModule, // To retrieve http module
    // BrowserModule provides services that are essential to launch and run a browser application. 
    // BrowserModule also re-exports CommonModule from @angular/common , 
    // which means that components in the AppModule also have access to the Angular directives every application needs, such as NgIf and NgFor .
    BrowserModule, 
    FormsModule,
    AppRoutingModule // For navigation purpose: router, route, routerLink, routerLinkActive
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

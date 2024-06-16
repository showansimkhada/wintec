## Assignment 1 – Part1 Design, Create and Populate a Database for the Project
<h3>This assignment is part of a project where the finished product is a simple forms‐based application. The application is comprised of seven forms, named GridView, Login, Menu, Selection, Faculty, Student and Course. This example is designed to map a Computer Science and Engineering Department in a university. The application allows the users to scan and browse all information about a department, including faculty, courses taught by selected faculty, students and courses taken by the associated student.
In this assignment, you will develop the back‐end database in Micosoft Access. The development comprises:</h3>
<ul>
  <li>Designing the tables</li>
  <li>Creating the relationships between the tables demonstrating the use of 1:M and 1:1 relationships</li>
  <li>>Populating the tables with data by importing the data from text files</li>
</ul>
<h3>You will be marked on:</h3>
<ul>
  <li>Table design including the use of meaningful field names and the correct data types for each of the fields</li>
  <li>Building the correct relationships between the tables
  Centre for Business, Information Technology and Enterprise, Wintec, Tristram Street, Hamilton, New Zealand</li>
  <li>>mporting the data correctly into the tables</li>
  <li>Building a simple query to prove that the relationships between the tables are correct and that the data has been imported correctly</li>
  <li>Building a simple report to prove that the query has been constructed correctly</li>
</ul>
<h3>Tasks:</h3>
<ol>
  <li>Using Microsoft Access, create a Blank database and call it CSE_DEPT, keep the extension of .accdb and save it to a folder on your computer/network (e.g. ITPD711\Assignment\Part 1) – [5 Marks]</li>
  <li>Create the tables using the table and field names shown (Note: You will NOT be awarded full marks if you use other table and field names). You will need to look at the data in the text files, for each of the tables, to ascertain the correct data types to use – [60 Marks – 1 mark per table name, field name and datatype]</li>
    <table>
      <tr>
        <th>Table Name</th>
        <th>Fields (the # denotes Primary key)</th>
      </tr>
      <tr>
        <td>Login</td>
        <td>#user_name, pass_word, faculty_id, student_id</td>
      </tr>
      <tr>
        <td>Faculty</td>
        <td>#faculty_id, faculty_name, office, phone, college, title, email</td>
      </tr>
      <tr>
        <td>Course</td>
        <td>#course_id, course, credit, classroom, schedule, enrolment, faculty_id</td>
      </tr>
      <tr>
        <td>Studen</td>
        <td>#student_id, student_name, gpa, credits, major, schoolYear, email</td>
      </tr>
      <tr>
        <td>StudentCourse</td>
        <td>#s_course_id, student_id, course_id, credit, major</td>
      </tr>
    </table>
  <li>Using the Database Relationships tool, create the relationships between each of the tables. Create and save an image of the relationships as a JPEG file and save to your folder. (Hint: use the snipping tool) – [5 marks]</li>
  <li>Import the data from the text files into each of the tables – [5 marks]</li>
  <li>Create a query (view) to show the Course name, schedule and students who are taking the course as per the figure shown – [5 marks]</li>
    <table>
      <tr>
        <th>course</th>
        <th>schedule</th>
        <th>student_name</th>
      </tr>
      <tr>
        <td>Computers in society</td>
        <td>M-W-F: 9:00-9:55 AM</td>
        <td>Holes Smith</td>
      </tr>
      <tr>
        <td>Introduction to Programming</td>
        <td>M-W-F: 9:00-9:55 AM</td>
        <td>Blue Valley</td>
      </tr>
      <tr>
        <td>Internet Programming</td>
        <td>M-W-F: 1:00-1:55 PM</td>
        <td>Erica Johnson</td>
      </tr>
      <tr>
        <td>Applications Programming</td>
        <td>T-H: 11:00-12:25 PM</td>
        <td>Andrew Woods</td>
      </tr>
      <tr>
        <td>Data Structure & Algorithms</td>
        <td>T-H: 11:00-12:25 PM</td>
        <td>Holes Smith</td>
      </tr>
      <tr>
        <td>Introductuon to Algorithms</td>
        <td>M-W-F: 9:00-9:55 AM</td>
        <td>Blue Valley</td>
      </tr>
    </table>
  <li>Create a report to show the students per course. Group your data by Course. Note: The schedule should only appear once per course – [5 marks]</li>
</ol>
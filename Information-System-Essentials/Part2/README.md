## Part2: Create the Course Form for the CSE_DEPT Project
<h3>This assignment is part of a project where the finished product is a simple forms-based application. The application is comprised of seven forms, named GridView, Login, Menu, Selection, Faculty, Student and Course. This example is designed to map a Computer Science and Engineering Department in a university. The application allows the users to scan and browse all information about a department, including faculty, courses taught by selected faculty, students and courses taken by the associated student.
In this assignment, you will follow the instructions below, absolutely identically to create the Course Form for the CSE_DEPT project which we have been working on. To date, you have been shown, how to code the Gridview, Login, Menu and Faculty Forms.</h3>
<h3>In this part, all you have to do is to follow the set of instructions. If you do, then your code will work. Following instructions is a critical task in the industry. In addition, you will also learn some new coding techniques which you will most definitely be able to use in the industry in the future. Also, for part 3b of this assignment, you will be coding the Students form and you will be able to refer to the code from the Faculty Form and the Course form to assist you with the coding of the Student form. The functions of this form allows users to find the course taught by the selected faculty from the Faculty Name ComboBox control when users click on the Select button. All courses, that is, all course_id, are displayed in the Course Listbox. The detailed information for each course, such as Course Title, Course Schedule, Classroom, Credits and Enrolment can be obtained by clicking on the desired course_id from the Course Listbox and displayed in five textbox controls.
The back button allows users to return to the Main Menu to make other selections. For this part of your assignment you will be writing the code for the Select and the Back buttons.
You will be marked on:</h3>
<ul>
    <li>Following the instructions to create this form</li>
    <li>Ensuring that you had modified your Menu Form to be able to open this form</li>
    <li>The execution of this form, as part of the application</li>
</ul>
<h3>Tasks:</h3>
<ol>
    <li>Open your SelectionWizard solution and open your course form in design mode.</li>
    <li>First of all, you need to modify the DataSet so that you can find the courses taught by the selected Faculty from the Course table. You need to obtain the Faculty ID that is associated with the selected Faculty combobox control when the Select button is clicked because no faculty name is available from the Course table. The only available information on the Course table is the faculty_id. So you first of all need to create a query that returns a single value (faculty_id) from the Faculty table and then you will need to create another query in the Course table to find the courses (by course_id) taught by the selected faculty based on the faculty_id we obtained from the Faculty table.</li>
    <li>Open the Dataset designer Wizard and right-click the last line of the Faculty table and select Add Query to open the TableAdapterQuery Configuration Wizard</li>
    <li>Keep the default selection: Use SQL Statements and click the Next button</li>
    <li>Check the radio button of Select which returns a single value to choose this query type and click Next</li>
    <li>Click on the Query Builider to build the query</li>
    <li>On the Opened Query Builder Wizard, remove the default query from the text pane by highlighting it and select the DELETE button. Then right-click the top pane and select the Add Table item to open the Add Table wizard. Select the Faculty Table table by clicking on it from the table list, and then click on the ADD and the CLOSE buttons to add this table</li>
    <li>Select the Faculty_ID and the faculty_name from the Faculty table by checking them in the top pane and unchecking the Output checkbox for the faculty_name row in the mid-pane since we do not want to query the faculty_name but only use it as the criterion to find the faculty_id</li>
    <li>Then type a questions mark on the Filter column for the faculty_name row and press the Enter key from your keyboard. Your finished query should look something like this: SELECT faculty_id FROM faculty WHERE (faculty_name = ?)</li>
    <li>Click on the OK buttons and the NEXT buttons to go to the next wizard. Enter FindFacultyIDByName into the box as our function name and then click on NEXT and the FINISH buttons to complete this query building.</li>
    <li>Next build the second query to find the courses (course_id) taught by the selected faculty from the Course table.</li>
    <li>Open the DataSet Designer to create the query and modify the Fill() method for the CourseTableAdapter</li>
    <li>Right-Click the last row in the Course Table and choose Add Query item to open the TableAdapter Configuration Wizard.</li>
    <li>Keep the default selection Use SQL Statements and click on the NEXT button</li>
    <li>Keep the default selection SELECT which return rows unchanged and click on the NEXT button</li>
    <li>Click on the Query Builder to open the Query Builder window</li>
    <li>Keep the default selections for the top graphical pane. Go to the Filter column along the faculty_id row and type an equals sign and a question mark (?) and press the enter key</li>
    <li>The completed SQL statement, displayed in the text pane looks like:
    SELECT course_id, course, credits, classroom, schedule, enrolment, faculty_id FROM course
    WHERE (faculty_id = ?)</li>
    <li>Click on the OK button and the NEXT button to return to the TableAdapter Wizard to modify the Fill() method. Change the Fill() method to FillByFacultyID and then click on the NEXT and the FINISH button to complete this configuration</li>
</ol>
<h3>Bind the Controls from the Course Form</h3>
<ul>
    <li>First, bind the CourseList (listbox) to the course_id column in the Course table in the DataSet. Remember that there are many course records with the same faculty_id in this Course table. Those multiple records with the same faculty_id are distinguished by the different course_id taught by that faculty.</li>
    <li>To bind a ListBox to those multiple records with the same faculty_id, it is not possible to use the same binding method as has been used before for the textbox controls on the Faculty and Login forms. This is the specialty of binding a Listbox control. The special point is that the relationship between the ListBox and the data items in a table is one-to-many, which means that the ListBox can contain multiple items. In this case, the CourseList can contain many course_id. So the binding of a ListBox control is to bind a ListBox to a table in the DataSet, that is, to the Course table in this instance. Peform the following operation to complete this binding:</li>
    <ol>
        <li>Click on the CourseList control from the Course form and go to the DataSource property. Then click on the drop-down arrow to expand the data source until the Course table is found. Select this table by clicking on this item.</li>
        <li>Go to the DisplayMember property and expand the Course table to find the course_id column and select it by clicking on this item. In this way, a binding relationship between the Course ListBox in the Course form and the Course data table data in the DataSet.</li>
        <li>Next bind the six textbox controls to the DataSet.</li>
        <li>Keep the Course form opened and then select the CourseID textbox, from the Course Form.</li>
        <li>Go to the DataBindings property and expand to the Text item. Click on the dropdown arrow and you will find the CourseBindingSource object is already created there for this project. Expand this CourseBindingSource until you find the course_id column and then choose it by clicking on the course_id columns</li>
        <li>Now repeat this process to set up the other data bindings for the following five textbox controls: Course, Schedule, Classroom, Credits and Enrolments. One thing to remember is that the order of performing these two bindings. You must first perform the binding for the CourseList control and then perform the binding for six Textboxes</li>
    </ol>
</ul>
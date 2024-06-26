## Practical 2
<h3>Learning outcomes: The course work questions cover Learning Outcomes 1 – 3</h3>
<p>Aims: The course work questions aim to practice the following topics:</p>
<ul>
    <li>Basic input and output operations</li>
    <li>Coding standards</li>
    <li>Debugging and testing by using features of Integrated Development Environment
    (IDE)</li>
    <li>The use of methods (both static and instance) and parameters in solving problems</li>
    <li>Design and implement classes and objects</li>
        <ul>
            <li>public and private class fields</li>
            <li>constructors, public, and private methods</li>
            <li>Modular programming</li>
            <li>Problem solving using classes and objects</li>
        </ul>
    <li>Derived classes and protected variables and methods: Examples and problem</li>
    solving
    <li>Polymorphism and its advantages in software development: Examples and problem</li>
    solving
    <li>Using object oriented programming to develop applications</li>
    <li>Object oriented programming and code reuse</li>
    <li>Array of objects</li>
    <li>Object persistence with file I/O</li>
</ul>
<p>Weighting: 20%</p>
<p>Mark allocation on questions:</p>
<table>
    <tr>
        <th>Question No.</th>
        <td>1</td>
        <td>2</td>
        <td>3</td>
        <td>4</td>
        <td>5</td>
        <td>Total</td>
    </tr>
    <tr>
        <th>Marks</th>
        <td>15</td>
        <td>15</td>
        <td>15</td>
        <td>20</td>
        <td>35</td>
        <td>100</td>
    </tr>
</table>
<p>Due date: see module timetable on Moodle</p>
<p>Marking process:</p>
<ul>
    <li>Step 1: upload your solutions (as a zip file) to Moodle (under Assessments).</li>
    <li>Step 2: demonstrate your solution to your tutor. You may have to explain to your tutor how your program works, and be prepared to answer questions with regard to your solution.</li>
</uL>
<table>
    <tr>
        <th>Q1 – JavaFX GUI Application</th>
    </tr>
    <tr>
        <td>Learning outcomes: 1&3</td>
    </tr>
    <tr>
        <td>Relevant topics: input, output, iteration, array, class, objects, method invocation</td>
    </tr>
    <tr>
        <td>Suggested time to complete: Week 7</td>
    </tr>
    <tr>
        <td>Resources: in-class examples, reference material on Moodle, recommended textbooks</td>
    </tr>
    <tr>
        <td>Moodle section reference: JavaFX</td>
    </tr>
</table>
<p>Write a JavaFX GUI application that simulates the Pacman game (AKA, “Hungary Bug”). The sample screenshot on the left below shows the start of a game, dots are randomly generated and scattered across the game pane. You can choose the size and colour of the dots. The red, big dot mimics the Pacman, which is controlled by the four arrow keys on the keyboard to move around the pane “gobbling” the dots (i.e., as soon as the Pacman overlaps with a dot, the dot is removed from the pane). A stop watch is created to time the game (at the top-left corner).</p>
<table>
    <tr>
        <th>Q2 – Encapsulation</th>
    </tr>
    <tr>
        <td>Learning outcomes: 1&3</td>
    </tr>
    <tr>
        <td>Relevant topics: input, output, iteration, array, class, objects, encapsulation</td>
    </tr>
    <tr>
        <td>Suggested time to complete: Week 7</td>
    </tr>
    <tr>
        <td>Resources: in-class examples, reference material on Moodle, recommended textbooks</td>
    </tr>
    <tr>
        <td>Moodle section reference: Encapsulation</td>
    </tr>
</table>
<p>Create a class Note, as in note in music. A Note object is represented by a pitch (one of the seven letters – C, D, E, F, G, A, and B – which is the simplest and most common way of specifying a music note), and a duration (in number of seconds). Write the class Note that contains</p>
<ul>
    <li>Private class fields with getter/setter: pitch (string), duration (int).</li>
    <li>A parameterized constructor that takes two parameters and sets the fields.</li>
    <li>A public method playNote() that outputs the pitch and the duration of a note in the format as in the sample output below (i.e., “The note … is played for … seconds”). Method header is given as following:</li>
    <ul>
        <li>public void playNote()</li>
    </ul>
</ul>
<p>The code of the main() has been given below. The code uses the array shorthand notation syntax to create an array of Note objects. The array of objects is then passed to the method processNotes.</p>
<table>
    <tr>
        <td>Q3 – Inheritance</td>
    </tr>
    <tr>
        <td>Learning outcomes: 1&3</td>
    </tr>
    <tr>
        <td>Relevant topics: input, output, iteration, array, class, objects, encapsulation, inheritance
    </tr>
    <tr>
        <td>Suggested time to complete: Week 9</td>
    </tr>
    <tr>
        <td>Resources: in-class examples, reference material on Moodle, recommended textbooks</td>
    </tr>
    <tr>
        <td>Moodle section reference: Inheritance</td>
    </tr>
</table>
<p>Create a class Shape, which contains</p>
<uL>
    <li>Private class field with getter/setter: colour (string)</li>
    <li>A parameterized constructor that takes a single parameter and sets the field.</li>
    <li>A public method getShapeType() that returns the string “General Shape”. Method header:</li>
    <ul>
        <li>public String getShapeType()</li>
    </ul>
</uL>
<p>Create a class Rectangle, which inherits the Shape class and contains</p>
<ul>
    <li>Private class fields with getter/setter: height (double), width (double).</li>
    <li>A parameterized constructor that takes three parameters. Invoke the super class constructor by using the “super” keyword.</li>
    <li>An override method getShapeType() that returns the word “Rectangle”. Method header:</li>
    <ul>
        <li>@Override public String getShapeType()</li>
    </ul>
    <li>A method getPerimeter() that calculates and returns the rectangle perimeter. Method header:</li>
    <ul>
        <li>public double getPerimeter()</li>
    </ul>
<p>In the main() method, two arrays of Rectangle objects have already been created for you by using the shorthand notation.</p>
<table>
    <tr>
        <th>Q4 – Recursion of a list of objects</th>
    </tr>
    <tr>
        <td>Learning outcomes: 1&3</td>
    </tr>
    <tr>
        <td>Relevant topics: input, output, recursion, methods, class, objects</td>
    </tr>
    <tr>
        <td>Suggested time to complete: Week 10</td>
    </tr>
    <tr>
        <td>Resources: in-class examples, reference material on Moodle, recommended textbooks</td>
    </tr>
    <tr>
        <td>Moodle section reference: Recursion</td>
    </tr>
</table>
<p>Create a class Book that contains</p>
<ul>
    <li>Private class fields with getter/setter: title (string), numOfPages (int).</li>
    <li>A parameterized constructor that takes two parameters and sets the class fields.</li>
</uL>
<table>
    <tr>
        <tH>Q5 – Objects and File I/O</tH>
    </tr>
    <tr>
        <td>Learning outcomes: 1&3</td>
    </tr>
    <tr>
        <td>Relevant topics: input, output, class, objects, methods, File input & output</td>
    </tr>
    <tr>
        <td>Suggested time to complete: Week 10</td>
    </tr>
    <tr>
        <td>Resources: in-class examples, reference material on Moodle, recommended textbooks</td>
    </tr>
    <tr>
        <td>Moodle section reference: File I/O</td>
    </tr>
</table>
<p>Create an Eclipse project, then create a folder named data at the top level of the project. To create a folder in Eclipse, in the Package Explorer pane,right-click project name, New, Folder, then type the folder name “data” in the popup dialog. To create a text file in the “data” folder, right-click the folder name, New, File, then type “data.txt” in the popup dialog. Create the text file “data.txt” with the content listed in the box to the right. The text contains information about five student records, with <student_id> and <score> separated by comma, one record per line.</p>
<p>Create a class Student, which contains</p>
<ul>
    <li>Private class fields with getter/setter: ID (string), score (double).</li>
• A parameterized constructor that takes two parameters and sets the ID and score fields.
</ul>
<p>Create a class ScoreApp, in which,</p>
<ul>
    <li>Create a list of Student objects “students” as a class field, with getter.</li>
    <li>Write a paramerised constructor, with a file name as its parameter.</li>
    <li>Create a method readStudentData() to read the file content and populate the objects. In particular, first initialize the “students” list (i.e., students = new LinkedList<Student>()), then read the file content, line by line, until the end of the file. Split each line into two items (use the Split method); use the two items to create a Student object and add the object to the “students” list.</li>
    <li>Write a method printAll(), in which, traverse through the list and output each object to screen.</li>
    <li>Write a method getMaxScore() that calculates and returns the highest score of all students.</li>
    <li>Write a method getAverageScore() that calculates and returns the average score of all students.</li>
    <li>Write a method countPassScore() that counts the number of students who have passed (50 or above). The method should return the count at the end.</li>
    <li>In the Main class, write a static recursive method. The method should have the signature: public static double recursiveGetTotalScore(List<Student> list). I.e., the method takes a list of Student objects as parameter, and recursively calculates the total score of all students. The method should return the total in the end.</li>
</ul>
//Student name: Showan Simkhada
//Student ID: 17459655
//Pledge of Honor: I pledge by honor that this program is solely my own work.

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ScoreApp app = new ScoreApp("src/data/data.txt");
        app.printAll();
        System.out.println(String.format("%50s", "").replace(' ', '-'));
		System.out.println("Max score: " + app.getMaxScore());
		System.out.println("Average score: " + app.getAverageScore());
		System.out.println("Number of pass scores: " + app.countPassScore());
		System.out.println("Total score (recursion): " + recursiveGetTotalScore(app.getStudents())); 
    }

    static double recursiveGetTotalScore(List<Student> st) {
        double total = 0;
        if (st.size() == 0 || st == null) {
            return 0;
        } else {
            double firstScore = st.get(0).getScore();
            List<Student> subList = st.subList(1, st.size());
            total = firstScore + recursiveGetTotalScore(subList);
        }
        return total;
    }
}

class ScoreApp {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public ScoreApp(String filename) {
        students = new ArrayList<>();
        readStudentData(filename);
    }

    public void readStudentData(String filename) {
        File f = new File(filename);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String inp = new String(sc.nextLine());
                String[] inp1 = inp.split(",");
                String id = inp1[0];
                double score = Double.parseDouble(inp1[1]);
                Student st = new Student(id, score);
                students.add(st);
            }
            sc.close();
        } catch(IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void printAll() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getID() + ": " + students.get(i).getScore());
        }
    }

    public double getMaxScore() {
        double max = 0;
        for (int i =0; i < students.size(); i++) {
            if (students.get(i).getScore() > max) {
                max = students.get(i).getScore();
            }
        }
        return max;
    }

    public double getAverageScore() {
        double av = 0;
        double sum = 0;
        for (int i =0; i < students.size(); i++) {
            sum = sum + students.get(i).getScore();
        }
        av = sum/students.size();
        return av;
    }

    public int countPassScore() {
        int count = 0;
        for (int i =0; i < students.size(); i++) {
            if (students.get(i).getScore() >= 50) {
                count++;
            }
        }
        return count;
    }
}

class Student {
    private String ID;
    private double Score;

    // Constructor for class with attributes
    Student(String ID, double Score) {
        this.ID = ID;
        this.Score = Score;
    }

    // Creating getters and setters
    public String getID() {
        return ID;
    }

    public double getScore() {
        return Score;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }
}
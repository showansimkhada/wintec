// Student name: Showan Simkhada
// Student ID: 17459655
// Pledge of Honor: I pledge by honor that this program is solely my own work.

public class App {
    public static void main(String[] args) throws Exception {
        // Creating two arrays
        Rectangle[] rectangleArray1 = {
            new Rectangle("white", 4, 3),
            new Rectangle("red", 9, 5),
            new Rectangle("purple", 3, 6),
            new Rectangle("orange", 15, 10),
            new Rectangle("black", 4, 14)
        };
        
        Rectangle[] rectangleArray2 = {
            new Rectangle("pink", 3, 4),
            new Rectangle("red", 10, 2),
            new Rectangle("white", 8, 5),
            new Rectangle("blue", 14, 4),
            new Rectangle("bindle", 10, 15)
        };

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < rectangleArray1.length; i++) {
            for (int j = 0; j < rectangleArray2.length; j++) {
                if (rectangleArray1[i].getColour() == rectangleArray2[j].getColour()) {
                    count1++;
                }
                if (rectangleArray1[i].getPerimeter() == rectangleArray2[j].getPerimeter()) {
                    count2++;
                }
                System.out.println("There are " + count1 + " rectangle objects with overlapping colours between the two arrays.");
                System.out.println("There are " + count2 + " rectangle objects with overlapping perimeters between the two arrays.");
            }
        }
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;

    Rectangle(String colour, double height, double width) {
        super(colour);
        this.height = height;
        this.width = width;
    }

    // Creating getters and setters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override public String getShapeType() {
        return ("Rectangle");
    }

    public double getPerimeter() {
        double per = 0;
        per = 2 * (getHeight() + getWidth());
        return per;
    }
}

class Shape {
    private String colour;

    Shape (String colour) {
        this.colour = colour;
    }

    //  Creating getters and setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getShapeType() {
        return ("General Shape");
    }
}
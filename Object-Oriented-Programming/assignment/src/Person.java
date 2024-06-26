public class Person {
    String Name;
    int Age;

    // Constructor class with attributes
    Person(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    // Creating getters and setters
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    void displayInfo() {
        System.out.println(getName() + getAge());
    }
}

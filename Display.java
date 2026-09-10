class Display {

    // Display name
    void show(String name) {
        System.out.println("Name: " + name);
    }

    // Display name and age
    void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Display name, age, and marks
    void show(String name, int age, double marks) {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Display obj = new Display();

        obj.show("Rahul");
        obj.show("Rahul", 20);
        obj.show("Rahul", 20, 85.5);
    }
}
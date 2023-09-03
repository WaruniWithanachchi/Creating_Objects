public class Student {
    String name;

    Student(String name){
        this.name=name;
    }

    public static void main(String[] args) {

        Student st1 = new Student("Sam");
        Student st2 = new Student("John");

        System.out.println("Name is "+st1.name);
        System.out.println("Name is "+st2.name);
    }
}

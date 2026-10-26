package assignment03;

import java.time.LocalTime;

import assignment03.AbstractStudent;

public class Driver {
    public static void main(String[] arges){

        Person p = new Person("Heraclio Maldonado", "2005-01-01"); 
        AbstractStudent student = new ConcreteStudent(p);

        student.setMajor("Computer Science");
        student.setUniversity("Binghamton University");

        System.out.println("Student: " + student.getInnerSelf().getName());
        System.out.print("\nEnrolled Courses");

        student = new CS350(student);
        student = new CS373(student);
        student = new CS542(student);
        student = new CS375(student);

        System.out.println(student.getCourses());

        System.out.println("Expected true: " + student.timeConflict(LocalTime.of(13, 45)));

        System.out.println("Expected false: " + student.timeConflict(LocalTime.of(17, 00)));
    }
}

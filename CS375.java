package assignment03;

import java.time.LocalTime;

public class CS375 extends CourseDecorator {
    public CS375(AbstractStudent stu) {
        super(stu, "CS", "375", "Algorithms", 3, "01", 
                LocalTime.of(15,30), LocalTime.of(16,30));
    }
    
}
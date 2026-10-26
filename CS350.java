package assignment03;

import java.time.LocalTime;

public class CS350 extends CourseDecorator {
    public CS350(AbstractStudent stu) {
        super(stu, "CS", "350", "Operating Systems", 3, "01", 
                LocalTime.of(9,0), LocalTime.of(10,0));
    }
    
}

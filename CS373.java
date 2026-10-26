package assignment03;

import java.time.LocalTime;

public class CS373 extends CourseDecorator {
    public CS373(AbstractStudent stu) {
        super(stu, "CS", "373", "Automata Theory", 3, "01", 
                LocalTime.of(11,0), LocalTime.of(12,0));
    }
    
}

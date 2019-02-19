package exampleTwo;

import exampleTwo.days.DayOfWeek;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(DayOfWeek.class);

        DayOfWeek weekDay = context.getBean(DayOfWeek.class);
        System.out.println("It's " + weekDay.getDay().getWeekDayName() + " today!");
    }
}

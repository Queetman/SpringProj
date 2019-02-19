package exampleTwo;

import exampleOne.entities.Animal;
import exampleOne.entities.Dog;
import exampleTwo.days.DayOfWeek;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(DayOfWeek.class);

        DayOfWeek weekDay = context.getBean(DayOfWeek.class);
        System.out.println("It's " + weekDay.getDay().getWeekDayName() + " today!");

        Animal dog = (Dog) context.getBean("dog");

        System.out.println(dog.getName());
    }
}

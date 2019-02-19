package exampleTwo.days;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration

//Здесь добавлдено автоматическое сканирование. т.е при запросе к этому классу, сканируется "exampleOne.entities"
// и создаются бины классоов в директории
@ComponentScan("exampleOne.entities")
public class DayOfWeek {

    @Bean
    public static WeekDay getDay() {
        java.time.DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY:
                return new Monday();
            case TUESDAY:
                return new Tuesday();
            case WEDNESDAY:
                return new Wednesday();
            case THURSDAY:
                return new Thursday();
            case FRIDAY:
                return new Friday();
            case SATURDAY:
                return new Saturday();
            default:
                return new Sunday();
        }
    }
}

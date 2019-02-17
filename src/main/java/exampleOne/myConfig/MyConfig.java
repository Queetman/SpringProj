package exampleOne.myConfig;

import exampleOne.entities.Cat;
import exampleOne.entities.Dog;
import exampleOne.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("parrot")
    public Object weNeedMoreParrots() {
        return new Parrot();
    }

    @Bean("dog")
    Dog getDog() {
        return new Dog();
    }

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

}

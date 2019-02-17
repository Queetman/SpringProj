package exampleOne.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    private String name = "Sharik";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

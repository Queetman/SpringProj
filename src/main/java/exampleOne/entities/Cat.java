package exampleOne.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    String name = "Musya";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}

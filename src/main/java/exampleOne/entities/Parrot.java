package exampleOne.entities;

import org.springframework.stereotype.Component;

@Component("parrot")
public class Parrot implements Animal {

    private String name = "Kesha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}

package exampleOne;

import exampleOne.entities.Animal;
import exampleOne.entities.Cat;
import exampleOne.entities.Dog;
import exampleOne.entities.Parrot;
import exampleOne.myConfig.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    //поиск классов по различным параметрам
    public static void main(String[] args) {

        ApplicationContext contextOne =
                new AnnotationConfigApplicationContext("exampleOne/entities");

        ApplicationContext contextTwo =
                new AnnotationConfigApplicationContext(MyConfig.class);

        getData(contextOne);
        System.out.println();
        getData(contextTwo);
    }

    private static void getData(ApplicationContext context) {

        Animal cat = context.getBean(Cat.class);
        Animal dog = (Dog) context.getBean("dog");
        Animal parrot = context.getBean("parrot", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
 /*
 Если один файл с конфигурацией
         ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

       Если два файла с конфигурацией
       ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class, MyAnotherConfig.class);

        Если все конфигурационные файлы тнаходятся в папке configs
                ApplicationContext context =
	new AnnotationConfigApplicationContext("configs");

	    Если конфигурационные файлы в разных папках
	    ApplicationContext context =
	new AnnotationConfigApplicationContext("configs","configs2","configs3");
	*/
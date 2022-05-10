package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
//        System.out.println(cat.getMessage());

        Cat myshyk = (Cat) applicationContext.getBean("cat");
        System.out.println(myshyk);
//        System.out.println(myshyk.getMessage());

        boolean com = cat.equals(myshyk);
        System.out.println("com = " + com);


    }
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld newBean =
                applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat newCat = applicationContext.getBean("cat", Cat.class);

        System.out.println("Проверка HelloWorld: " + (bean == newBean));
        System.out.println("Проверка Cat: " + (cat == newCat));

    }
}
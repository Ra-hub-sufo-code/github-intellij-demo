import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(8);
        String[] friName = { "Raushan","Abhishek","Rahul","Manisha","Manish",
                            "Beauty","Ravindra","Aditya","Karan","Ranjan",
                            "Rishi","Tarun","Ayush","Ankit","Prince","Bipin"
        };

        for (String nam:friName) {
            SentLetter task = new SentLetter(nam);
            service.submit(task);
        }
        service.shutdown();
    }
}

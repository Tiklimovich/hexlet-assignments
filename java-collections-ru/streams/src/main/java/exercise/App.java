package exercise;
import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long result1 = emails.stream()
                .filter(email -> email.endsWith("gmail.com"))
                .count();
        long result2 = emails.stream()
                .filter(email -> email.endsWith("yandex.ru"))
                .count();
        long result3 = emails.stream()
                .filter(email -> email.endsWith("hotmail.com"))
                .count();
        long result = result1 + result2 + result3;
        return result;


    }
}
// END

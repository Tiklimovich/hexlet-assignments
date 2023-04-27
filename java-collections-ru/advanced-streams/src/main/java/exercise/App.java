package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App{
    public static String getForwardedVariables(String content) {
       return Stream.of(content.split("\n"))
               .filter(element -> element.startsWith("environment="))
               .map(element -> element.replace("environment=", ""))
               .map(element -> element.replace("\"", ""))
               .flatMap(element -> Arrays.stream(element.split(",")))
               .filter(command -> command.startsWith("X_FORWARDED"))
               .map(command -> command.replace("X_FORWARDED_", ""))
               .collect(Collectors.joining(","));
    }
}
//END

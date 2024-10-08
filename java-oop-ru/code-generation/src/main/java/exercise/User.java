package exercise;

import lombok.Value;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

// BEGIN
@AllArgsConstructor
@Getter
@Value
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}

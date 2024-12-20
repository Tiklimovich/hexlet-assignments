package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> num1 = new ArrayList<>();
        List<Integer> result1 = App.take(num1, 5);
        assertThat(result1).hasSize(0);

        List<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result2 = App.take(num2, 5);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertThat(result2).isEqualTo(expected2);

        List<Integer> num3 = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> result3 = App.take(num3, 3);
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(result3).isEqualTo(expected3);
    }
}

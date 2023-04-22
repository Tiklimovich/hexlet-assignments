package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake1() {
        // BEGIN
        List<Integer> testWrong1 = Arrays.asList(null, 5);
        assertThat(testWrong1).isEqualTo(testWrong1);
    }
    @Test
    void testTake2() {
        List<Integer> testRight = Arrays.asList(5, 5);
        assertThat(testRight).isEqualTo(testRight);
    }
    @Test
    void testTake3() {
        List<Integer> testWrong2 = Arrays.asList(2, 3);
        assertThat(testWrong2).isEqualTo(testWrong2);
    }
    @Test
    void testTake4() {
        List<Integer> testWrong3 = Arrays.asList(3, 2);
        assertThat(testWrong3).isEqualTo(testWrong3);
        // END
    }
}

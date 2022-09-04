package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTestJava {

    @Test
    void firstTestJava() {
        int a = 8;
        Assertions.assertTrue(a > 2);
    }
}
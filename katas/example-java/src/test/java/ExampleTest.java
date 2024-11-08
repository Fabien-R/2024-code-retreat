import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest {

    @Test
    void shouldSucceedJava() {
        assertEquals(new X(5), new X(5));
    }
}

record X(int value) {}

enum Direction {
    EAST, NORTH, SOUTH, WEST;
}

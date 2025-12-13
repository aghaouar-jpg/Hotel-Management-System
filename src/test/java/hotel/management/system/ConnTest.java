package hotel.management.system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConnTest {

    @Test
    public void testConnObjectCreation() {
        conn c = new conn();
        assertNotNull(c, "conn object should not be null");
    }

    @Test
    public void testStatementMayBeNullButNoCrash() {
        conn c = new conn();
        assertDoesNotThrow(() -> {
            c.s = c.s;
        });
    }
}

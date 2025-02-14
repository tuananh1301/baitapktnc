import org.example.service.ServiceBai5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBai5 {
    @Test
    void testGetName_ValidProfile() {
        ServiceBai5 user = new ServiceBai5("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    void testGetName_NullProfile() {
        ServiceBai5 user = null;
        assertThrows(NullPointerException.class, () -> {
            user.getName();
        });
    }
}

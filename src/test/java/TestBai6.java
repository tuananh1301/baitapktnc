import org.example.service.ServiceBai6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBai6 {
    @Test
    void testFindMin_ValidArray() {
        int[] array = {4, 2, 7, 1, 9};
        assertEquals(1, ServiceBai6.findMin(array));
    }

    @Test
    void testFindMin_EmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> {
            ServiceBai6.findMin(array);
        });
    }
}

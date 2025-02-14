import org.example.service.ServiceBai4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBai4 {
    @Test
    void testGetElementAtIndex_ValidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, ServiceBai4.ArrayUtils.getElementAtIndex(array, 2));
    }

    @Test
    void testGetElementAtIndex_IndexOutOfBounds() {
        int[] array = {1, 2, 3, 4, 5};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ServiceBai4.ArrayUtils.getElementAtIndex(array, 10);
        });
    }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<Item> crateList(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void everyStatementTest() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(null, "123"));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));


        List<Item> items = crateList(
                new Item("David", 2, 30, 0.25),
                new Item("Bobby", 2, 50, 0.0),
                new Item("",4, 20, 10.0)
        );
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items, "123"));
        assertTrue(ex.getMessage().contains("Invalid item!"));


        List<Item> items2 = crateList(
                new Item("David", 2, 30, 25.0)
        );
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items2, "233456"));
        assertTrue(ex.getMessage().contains("Invalid card number!"));


        ex = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items2, "31d0024330010078"));
        assertTrue(ex.getMessage().contains("Invalid character in card number!"));


        double expected = 30 * (1 - 25.0) * 2 - 30;
        assertEquals(expected, SILab2.checkCart(items2, "3107002433001007"));
    }

    @Test
    void multipleConditionTest() {
        List<Item> items1 = crateList(
                new Item("David", 2, 400, 25.0)
        );
        double expected = 400 * (1 - 25.0) * 2 -30;
        assertEquals(expected, SILab2.checkCart(items1,"1234567891234567"));


        List<Item> items2 = crateList(
                new Item("David", 2, 200, 25.0)
        );
        double expected2 = 200 * (1 - 25.0) * 2 - 30;
        assertEquals(expected2, SILab2.checkCart(items2, "1234567891234567"));


        List<Item> items3 = crateList(
                new Item("David", 12, 200, 0.0)
        );
        double expected3 = 200 * 12 - 30;
        assertEquals(expected3, SILab2.checkCart(items3, "1234567891234567"));


        List<Item> items4 = crateList(
                new Item("David", 8, 200, 0.0)
        );
        double expected4 = 200 * 8;
        assertEquals(expected4, SILab2.checkCart(items4, "1234567891234567"));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {

    @Test
    @DisplayName("Given empty list, when I call isEmpty(), then true is returned")
    void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
//        Assertions.fail();
        List<Object> list = new CustomList<>();
        assertTrue(list.isEmpty());

    }

    @Test
    void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
        List<Object> list = new CustomList<>();
        list.add(null);

        assertFalse(list.isEmpty());
    }

    @Test
    void givenListWithAnElement_whenSize_thenOneIsReturned() {
        List<Object> list = new CustomList<>();
        list.add(null);

        assertEquals(1, list.size());
    }

    @Test
    void givenEmptyList_whenSize_ZeroIsReturned() {
        List<Object> list = new CustomList<>();
        assertEquals(0, list.size);
    }

    @Test
    void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        Object element = list.get(0);

        assertEquals("baeldung", element);
    }


    @Test
    void givenListWithSecondElement_WhenGet_thenThatElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("baeldung");
        list.add("tts");
        var element = list.get(1);
        assertEquals("tts", element);
    }

}
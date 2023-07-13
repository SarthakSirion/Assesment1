//Author: Sarthak Shrivastava

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameServiceTest {

    @ParameterizedTest
    @MethodSource("data")
    void test(String output, String input) {
        assertEquals(output, GameService.authorSearch(input));
    }

    @Test
    void test1() {
        assertNotNull(GameService.viewAll());
    }

    public static Collection data() {
        return Arrays.asList(new Object[][] { { "Not found", "D" }, { "SnowBird", "danny" }, { "FreshFood", "Ram" },
                { "Not found", "X" }, { "YammyTommy", "NarayAn" } });
    }
}
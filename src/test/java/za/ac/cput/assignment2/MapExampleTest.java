package za.ac.cput.assignment2;

import org.junit.jupiter.api.*;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class MapExampleTest {
    private HashMap<String,Integer> gameLevel;

    @BeforeEach
    void setHashMap(){
        gameLevel = new HashMap<String,Integer>();
    }

    @Test
    void testEmptyHashMap(){
        assertEquals(0,gameLevel.size());
    }

    @Test
    void testadd(){
        gameLevel.put("a" , 5);
        gameLevel.put("b" , 10);
        gameLevel.put("c" , 15);

        assertEquals(3,gameLevel.size());
    }

    @Test
    void testRemove(){
        gameLevel.put("a" , 5);
        gameLevel.put("b" , 10);
        gameLevel.put("c" , 15);

        gameLevel.remove("a");
        assertEquals(2,gameLevel.size());
    }

    @Test
    void testFind(){
        gameLevel.put("a" , 5);
        gameLevel.put("b" , 10);
        gameLevel.put("c" , 15);

        assertEquals(15,gameLevel.get("c"));
    }
}
package za.ac.cput.assignment2;
/***
 *
 * @author Caven Fernanda - 218074905
 *
 * This class Tests Add, remove and find methods of Set
 * */
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;

class SetExampleTest {
    private  HashSet<String> city;

    @BeforeEach
    void setStructure(){
        city = new HashSet<String>();
    }

    @Test
    void testSet(){
        assertEquals(0, city.size());
    }

    @Test
    void testAdd(){
        city.add("Cape Town");
        city.add("Durban");
        city.add("Johannesburg");

        assertEquals(3, city.size());
    }

    @Test
    void testRemove(){
        city.add("Cape Town");
        city.add("Durban");
        city.add("Johannesburg");
        city.remove("Durban");
        assertEquals(2,city.size());
    }

    @Test
    void testFind(){
        city.add("Cape Town");
        city.add("Durban");
        city.add("Johannesburg");

        assertTrue(city.contains("Durban"));

    }
}
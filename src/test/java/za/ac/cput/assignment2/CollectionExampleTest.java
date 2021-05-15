package za.ac.cput.assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionExampleTest <Integer>{
    private Collection value;

    @BeforeEach
    void setCollection(){
        value = new ArrayList();
    }

    @Test
    void testSet(){
        assertEquals(0,value.size());
    }

    @Test
    void testAdd(){
        value.add(5);
        value.add(145);
        value.add(74);

        assertEquals(3,value.size());
    }

    @Test
    void testRemove(){
        value.add(5);
        value.add(145);
        value.add(74);
        value.remove(0);

        assertEquals(2,value.size());
    }

    @Test
    void testFind(){
        value.add(5);
        value.add(145);
        value.add(74);

        assertTrue(value.contains(5));
    }
}
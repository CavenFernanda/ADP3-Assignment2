package za.ac.cput.assignment2;

/***
 *
 * @author Caven Fernanda - 218074905
 *
 * This class Tests Add, remove and find methods of List
 * */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class ListExampleTest {

    private LinkedList list;

    @BeforeEach
    void setList(){
        list = new LinkedList();
    }

    @Test
     void testEmptyList(){
        assertEquals(0,list.size());
    }

    @Test
    void testAdd(){
        list.add(5);
        list.add(8);
        assertEquals(2, list.size());
    }

    @Test
    void testRemove(){
        list.add(5);
        list.add(8);
        list.add(7);
        list.remove(1);
        assertEquals(2,list.size());
    }

    @Test
    void testFind(){
        list.add(5);
        list.add(8);
        list.add(7);
        Integer find = (int)list.get(0);
        assertEquals(5,find);
    }
}
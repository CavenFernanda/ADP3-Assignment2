package za.ac.cput.assignment2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    private Collection <Integer>value = new ArrayList();

    public void addAge(int a,int b){
        value.add(a);
        value.add(b);
        System.out.println(value.size());
    }

    public void removeAge(){
        value.add(5);
        value.add(8);
        value.add(7);
        value.remove(5);
    }

    public void findAge(){
        value.add(5);
        value.add(8);
        value.add(7);
    }
}

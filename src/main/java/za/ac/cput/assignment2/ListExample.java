package za.ac.cput.assignment2;

import java.util.LinkedList;

/***
 *
 * @author Caven Fernanda - 218074905
 *
 * Adds, removes and selects element within a LinkedList
 * */
public class ListExample {
    LinkedList<Integer> age = new LinkedList<Integer>();

    public void addAge(int a,int b){
        age.add(a);
        age.add(b);
        System.out.println(age.size());
    }

    public void removeAge(){
        age.add(5);
        age.add(8);
        age.add(7);
        age.remove(1);
    }

    public void findAge(){
        age.add(5);
        age.add(8);
        age.add(7);
        Integer find = (int)age.get(0);
    }

}

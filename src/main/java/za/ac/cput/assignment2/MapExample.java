package za.ac.cput.assignment2;
/***
 *
 * @author Caven Fernanda - 218074905
 *
 * Adds, removes and selects element within a HashMap
 * */
import java.util.HashMap;

public class MapExample {
    private HashMap<String,Integer> gameLevel = new HashMap<String,Integer>();

    public void add(String key, int level){
        gameLevel.put(key, level);
    }

    public void remove(String key){
        gameLevel.remove(key);
    }

    public void find(String name){
        gameLevel.get(name);
    }
}

package za.ac.cput.assignment2;
import java.util.HashSet;

public class SetExample {
    HashSet<String> city = new HashSet<String>();

    public void addAge(String a,String b){
        city.add(a);
        city.add(b);
        System.out.println(city.size());
    }

    public void removeAge(){
        city.add("Cape Town");
        city.add("Durban");
        city.add("Johannesburg");
        city.remove("Durban");
    }

    public void findAge(){
        city.add("Cape Town");
        city.add("Durban");
        city.add("Johannesburg");
        System.out.println(city.contains("Durban"));
    }

}

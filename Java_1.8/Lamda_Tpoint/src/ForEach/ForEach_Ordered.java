package ForEach;

import java.util.ArrayList;  
import java.util.List;  
public class ForEach_Ordered {  
    public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>();  
        
        gamesList.add("Cricket");
        gamesList.add("Football"); 
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.stream().forEachOrdered(System.out::println);  
    }  
  
} 
package ForEach;

    import java.util.ArrayList;  
    import java.util.List;  
    public class For_each1 {  
        public static void main(String[] args) {  
            List<String> gamesList = new ArrayList<String>();  
            gamesList.add("Football");  
            gamesList.add("Hocky");
            gamesList.add("Cricket");  
            gamesList.add("Chess");  
           
            System.out.println("------------Iterating by passing lambda expression--------------");  
            gamesList.forEach(games -> System.out.println(games));  
              
        }  
    }  
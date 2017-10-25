package Stream_filter;

    import java.util.*;  
    class Producct{  
        int id;  
        String name;  
        float price;  
        public Producct(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class Stream_Filter {  
        public static void main(String[] args) {  
            List<Producct> ProducctsList = new ArrayList<Producct>();  
            //Adding Produccts  
            ProducctsList.add(new Producct(1,"HP Laptop",25000f));  
            ProducctsList.add(new Producct(2,"Dell Laptop",30000f));  
            ProducctsList.add(new Producct(3,"Lenevo Laptop",28000f));  
            ProducctsList.add(new Producct(4,"Sony Laptop",28000f));  
            ProducctsList.add(new Producct(5,"Apple Laptop",90000f));  
            ProducctsList.stream()  
                        .filter(p ->p.price> 30000)   // filtering price  
                        .map(pm ->pm.price)          // fetching price  
                        .forEach(System.out::println);  // iterating price  
        }  
    }  
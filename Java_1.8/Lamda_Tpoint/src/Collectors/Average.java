package Collectors;

    import java.util.stream.Collectors;  
    import java.util.List;  
    import java.util.ArrayList;  
    class Productpz{  
        int id;  
        String name;  
        float price;  
          
        public Productpz(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class Average {  
        public static void main(String[] args) {  
            List<Productpz> ProductpzsList = new ArrayList<Productpz>();  
            //Adding Productpzs  
            ProductpzsList.add(new Productpz(1,"HP Laptop",25000f));  
            ProductpzsList.add(new Productpz(2,"Dell Laptop",30000f));  
            ProductpzsList.add(new Productpz(3,"Lenevo Laptop",28000f));  
            ProductpzsList.add(new Productpz(4,"Sony Laptop",28000f));  
            ProductpzsList.add(new Productpz(5,"Apple Laptop",90000f));  
            Double average = ProductpzsList.stream()  
                             .collect(Collectors.averagingDouble(p->p.price));  
            System.out.println("Average price is: "+average);  
        }  
    }  
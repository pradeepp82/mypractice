package Stream;

    import java.util.*;  
    import java.util.stream.Collectors;  
    class Productp{  
        int id;  
        String name;  
        float price;  
        public Productp(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class Collector_method {  
        public static void main(String[] args) {  
            List<Productp> ProductpsList = new ArrayList<Productp>();  
            //Adding Productps  
            ProductpsList.add(new Productp(1,"HP Laptop",25000f));  
            ProductpsList.add(new Productp(2,"Dell Laptop",30000f));  
            ProductpsList.add(new Productp(3,"Lenevo Laptop",28000f));  
            ProductpsList.add(new Productp(4,"Sony Laptop",28000f));  
            ProductpsList.add(new Productp(5,"Apple Laptop",90000f));  
            // Using Collectors's method to sum the prices.  
            double totalPrice3 = ProductpsList.stream()  
                            .collect(Collectors.summingDouble(Productp->Productp.price));  
            System.out.println(totalPrice3);  
              
        }  
    }  
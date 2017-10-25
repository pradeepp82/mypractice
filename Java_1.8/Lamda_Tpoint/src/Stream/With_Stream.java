package Stream;

    import java.util.*;  
    import java.util.stream.Collectors;  
    class Producta{  
        int id;  
        String name;  
        float price;  
        public Producta(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class With_Stream {  
        public static void main(String[] args) {  
            List<Producta> ProductasList = new ArrayList<Producta>();  
            //Adding Productas  
            ProductasList.add(new Producta(1,"HP Laptop",25000f));  
            ProductasList.add(new Producta(2,"Dell Laptop",30000f));  
            ProductasList.add(new Producta(3,"Lenevo Laptop",28000f));  
            ProductasList.add(new Producta(4,"Sony Laptop",28000f));  
            ProductasList.add(new Producta(5,"Apple Laptop",90000f));
            
            List<Float> ProductaPriceList2 =ProductasList.stream()  
                                         .filter(p -> p.price > 30000)// filtering data  
                                         .map(p->p.price)        // fetching price  
                                         .collect(Collectors.toList()); // collecting as list  
            System.out.println(ProductaPriceList2);  
        }  
    }  
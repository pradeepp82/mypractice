package Stream;

    import java.util.*;  
    class Productt{  
        int id;  
        String name;  
        float price;  
        public Productt(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class Fiter_With_Iterate {  
        public static void main(String[] args) {  
            List<Productt> productsList = new ArrayList<Productt>();  
            //Adding Products  
            productsList.add(new Productt(1,"HP Laptop",25000f));  
            productsList.add(new Productt(2,"Dell Laptop",30000f));  
            productsList.add(new Productt(3,"Lenevo Laptop",28000f));  
            productsList.add(new Productt(4,"Sony Laptop",28000f));  
            productsList.add(new Productt(5,"Apple Laptop",30000f));  
            // This is more compact approach for filtering data  
            productsList.stream()  
                                 .filter(product -> product.price == 30000)  
                                 .forEach(product -> System.out.println(product.name));    
        }  
    }  
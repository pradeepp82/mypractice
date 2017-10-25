package Collectors;

    import java.util.stream.Collectors;  
    import java.util.List;  
    import java.util.ArrayList;  
    class Productfg{  
        int id;  
        String name;  
        float price;  
          
        public Productfg(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            
            this.price = price;  
        }  
    }  
    public class Sum_method {  
        public static void main(String[] args) {  
            List<Productfg> ProductfgsList = new ArrayList<Productfg>();  
            //Adding Productfgs  
            ProductfgsList.add(new Productfg(1,"HP Laptop",25000f));  
            ProductfgsList.add(new Productfg(2,"Dell Laptop",30000f));  
            ProductfgsList.add(new Productfg(3,"Lenevo Laptop",28000f));  
            ProductfgsList.add(new Productfg(4,"Sony Laptop",28000f));  
            ProductfgsList.add(new Productfg(5,"Apple Laptop",90000f));  
            Double sumPrices =   
                    ProductfgsList.stream()  
                                .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
            System.out.println("Sum of prices: "+sumPrices);  
            Integer sumId =   
                    ProductfgsList.stream().collect(Collectors.summingInt(x->x.id));  
            System.out.println("Sum of id's: "+sumId);  
        }  
    }  
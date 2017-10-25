package Stream;

    import java.util.*;  
    import java.util.stream.Collectors;  
    class Productk{  
        int id;  
        String name;  
        float price;  
        public Productk(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
      
    public class List_To_Map {  
        public static void main(String[] args) {  
            List<Productk> ProductksList = new ArrayList<Productk>();  
      
            //Adding Productks  
            ProductksList.add(new Productk(1,"HP Laptop",25000f));  
            ProductksList.add(new Productk(2,"Dell Laptop",30000f));  
            ProductksList.add(new Productk(3,"Lenevo Laptop",28000f));  
            ProductksList.add(new Productk(4,"Sony Laptop",28000f));  
            ProductksList.add(new Productk(5,"Apple Laptop",90000f));  
              
            // Converting Productk List into a Map  
            Map<Integer,String> ProductkPriceMap =   
                ProductksList.stream()  
                            .collect(Collectors.toMap(p->p.id, p->p.name));  
                  
            System.out.println(ProductkPriceMap);  
        }  
    }  
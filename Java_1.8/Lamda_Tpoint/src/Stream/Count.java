package Stream;

    import java.util.*;  
    class Productpp{  
        int id;  
        String name;  
        float price;  
        public Productpp(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class Count {  
        public static void main(String[] args) {  
            List<Productpp> ProductppsList = new ArrayList<Productpp>();  
            //Adding Productpps  
            ProductppsList.add(new Productpp(1,"HP Laptop",25000f));  
            ProductppsList.add(new Productpp(2,"Dell Laptop",30000f));  
            ProductppsList.add(new Productpp(3,"Lenevo Laptop",28000f));  
            ProductppsList.add(new Productpp(4,"Sony Laptop",28000f));  
            ProductppsList.add(new Productpp(5,"Apple Laptop",90000f));  
            // count number of Productpps based on the filter  
            long count = ProductppsList.stream()  
                        .filter(Productpp->Productpp.price<30000)  
                        .count();  
            System.out.println(count);  
        }  
    }  
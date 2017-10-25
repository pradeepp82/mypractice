package Stream;

import java.util.*;  
class Productf{  
    int id;  
    String name;  
    float price;  
    public Productf(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Max_Min {  
    public static void main(String[] args) {  
        List<Productf> ProductfsList = new ArrayList<Productf>();  
        //Adding Productfs  
        ProductfsList.add(new Productf(1,"HP Laptop",25000f));  
        ProductfsList.add(new Productf(2,"Dell Laptop",30000f));  
        ProductfsList.add(new Productf(3,"Lenevo Laptop",28000f));  
        ProductfsList.add(new Productf(4,"Sony Laptop",28000f));  
        ProductfsList.add(new Productf(5,"Apple Laptop",90000f));  
        
        // max() method to get max Productf price   
        Productf ProductfA = ProductfsList.stream()  
                        .max((Productf1, Productf2)->   
                        Productf1.price > Productf2.price ? 1: -1).get();  
          
        System.out.println(ProductfA.price);
        
        // min() method to get min Productf price  
        Productf ProductfB = ProductfsList.stream()  
                .max((Productf1, Productf2)->   
                Productf1.price < Productf2.price ? 1: -1).get();  
        System.out.println(ProductfB.price);  
          
    }  
}
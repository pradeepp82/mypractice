package Stream_filter;

    import java.util.*;  
    import java.util.stream.Collectors;  
    class Pproduct{  
        int id;  
        String name;  
        float price;  
        public Pproduct(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
    }  
    public class Stream_Filter2 {  
        public static void main(String[] args) {  
            List<Pproduct> PproductsList = new ArrayList<Pproduct>();  
            //Adding Pproducts  
            PproductsList.add(new Pproduct(1,"HP Laptop",25000f));  
            PproductsList.add(new Pproduct(2,"Dell Laptop",30000f));  
            PproductsList.add(new Pproduct(3,"Lenevo Laptop",28000f));  
            PproductsList.add(new Pproduct(4,"Sony Laptop",28000f));  
            PproductsList.add(new Pproduct(5,"Apple Laptop",90000f));  
            List<Float> pricesList =  PproductsList.stream()  
                        .filter(p ->p.price> 30000)   // filtering price  
                        .map(pm ->pm.price)          // fetching price  
                        .collect(Collectors.toList());  
            System.out.println(pricesList);  
        }  
    }  
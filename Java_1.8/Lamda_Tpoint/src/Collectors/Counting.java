package Collectors;

    import java.util.stream.Collectors;  
    import java.util.List;  
    import java.util.ArrayList;  
    class Productfgg{  
        int id;  
        String name;  
        float price;  
          
        public Productfgg(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }  
        public int getId() {  
            return id;  
        }  
        public String getName() {  
            return name;  
        }  
        public float getPrice() {  
            return price;  
        }  
    }  
    public class Counting {  
        public static void main(String[] args) {  
            List<Productfgg>ProductfggsList = new ArrayList<Productfgg>();  
            //Adding Productfggs  
            ProductfggsList.add(new Productfgg(1,"HP Laptop",25000f));  
            ProductfggsList.add(new Productfgg(2,"Dell Laptop",30000f));  
            ProductfggsList.add(new Productfgg(3,"Lenevo Laptop",28000f));  
            ProductfggsList.add(new Productfgg(4,"Sony Laptop",28000f));  
            ProductfggsList.add(new Productfgg(5,"Apple Laptop",90000f));  
            Long noOfElements = ProductfggsList.stream()  
                                   .collect(Collectors.counting());  
            System.out.println("Total elements : "+noOfElements);  
        }  
    }  
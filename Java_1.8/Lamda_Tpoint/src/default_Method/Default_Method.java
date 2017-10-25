package default_Method;

    interface Sayableee{  
        // Default method   
        default void say(){  
            System.out.println("Hello, this is default method");  
        }  
        // Abstract method  
        void sayMore(String msg);  
    }  
    public class Default_Method implements Sayableee{  
        public void sayMore(String msg){        // implementing abstract method   
            System.out.println(msg);  
        }  
        public static void main(String[] args) {  
            Default_Method dm = new Default_Method();  
            dm.say();   // calling default method  
            dm.sayMore("Work is worship");  // calling abstract method  
      
        }  
    }  
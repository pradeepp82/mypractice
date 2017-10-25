package default_Method;

    interface Sayablea{    
        // default method    
        default void say(){    
            System.out.println("Hello, this is default method");    
        }    
        // Abstract method    
        void sayMore(String msg);    
        // static method    
        static void sayLouder(String msg){    
            System.out.println(msg);    
        }    
    }    
    public class Static_Method implements Sayablea{    
        public void sayMore(String msg){     // implementing abstract method    
            System.out.println(msg);    
        }    
        public static void main(String[] args) {    
            Static_Method dm = new Static_Method();    
            dm.say();                       // calling default method    
            dm.sayMore("Work is worship");      // calling abstract method    
            Sayablea.sayLouder("Helloooo...");   // calling static method    
        }    
    }    
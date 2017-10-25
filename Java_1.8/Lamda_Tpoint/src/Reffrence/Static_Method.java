package Reffrence;

    interface Sayable{  
        void say();  
    }  
    public class Static_Method {  
        public static void saySomething(){  
            System.out.println("Hello, this is static method.");  
        }  
        public static void main(String[] args) {  
            // Referring static method  
            Sayable sayable = Static_Method::saySomething;  
            // Calling interface method  
            sayable.say();  
        }  
    }  
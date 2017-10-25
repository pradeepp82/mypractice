package Reffrence;

    interface Sayabl{  
        void say();  
    }  
    public class Instance_Refference {  
        public void saySomething(){  
            System.out.println("Hello, this is non-static method.");  
        }  
        public static void main(String[] args) {  
            Instance_Refference methodReference = new Instance_Refference(); // Creating object  
            // Referring non-static method using reference  
                Sayabl sayable = methodReference::saySomething;  
            // Calling interface method  
                sayable.say();  
                // Referring non-static method using anonymous object  
                Sayabl sayable2 = new Instance_Refference()::saySomething; // You can use anonymous object also  
                // Calling interface method  
                sayable2.say();  
        }  
    }  
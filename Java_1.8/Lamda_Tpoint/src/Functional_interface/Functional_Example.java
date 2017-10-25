package Functional_interface;

    @FunctionalInterface  
    interface sayable{  
        void say(String msg);  
    }  
    public class Functional_Example implements sayable{  
        public void say(String msg){  
            System.out.println(msg);  
        }  
        public static void main(String[] args) {  
            Functional_Example fie = new Functional_Example();  
            fie.say("Hello there");  
        }  
    }  
package Reffrence;

    public class Instance_Thread {  
        public void printnMsg(){  
            System.out.println("Hello, this is instance method");  
        }  
        public static void main(String[] args) {  
        Thread t2=new Thread(new Instance_Thread()::printnMsg);  
           t2.start();       
        }  
    }  
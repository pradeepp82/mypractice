package Reffrence;

    interface Messageable{  
        Message getMessage(String msg);  
    }  
    
    class Message{  
        public Message(String msg){  
            System.out.print(msg);  
        }  
    }  
    public class Constructor_refference {  
        public static void main(String[] args) {  
            Messageable hello = Message::new;  
            hello.getMessage("Hello");  
        }  
    }  
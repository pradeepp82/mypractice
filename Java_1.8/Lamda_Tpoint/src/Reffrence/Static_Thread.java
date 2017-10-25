package Reffrence;

    public class Static_Thread {  
        public static void ThreadStatus(){  
            System.out.println("Thread is running...");  
        }  
        public static void main(String[] args) {  
            Thread t2=new Thread(Static_Thread::ThreadStatus);  
            t2.start();       
        }  
    }  
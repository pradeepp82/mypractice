package Lamda;

    import java.util.*;  
    public class For_Each{  
        public static void main(String[] args) {  
              
            List<String> list=new ArrayList<String>();  
            list.add("ankit");  
            list.add("mayank");  
            list.add("irfan");  
            list.add("jai");  
              
            list.forEach(  
                (n)->System.out.println(n)  
            );  
        }  
    }  
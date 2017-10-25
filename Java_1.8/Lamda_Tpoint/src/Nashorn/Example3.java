package Nashorn;

    import javax.script.*;  
    import java.io.*;  
    public class Example3 {  
        public static void main(String[] args) throws Exception{  
            // Creating script engine  
            ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
            //Binding script and Define scope of script  
            Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);  
            bind.put("name", "Nashorn");  
            // Reading Nashorn file  
            ee.eval(new FileReader("/home/pp/Desktop/hello.js"));  
        }  
    }  
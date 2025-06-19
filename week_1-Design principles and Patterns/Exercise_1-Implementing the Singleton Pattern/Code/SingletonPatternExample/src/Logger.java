public class Logger {
    //Create a private static instance of Logger
    private static Logger logger;



    //Make the constructor private so that no object can be created from outside
    private Logger(){  
         System.out.println("Logger instance created.");
      }
    


    //Provide a public static method to get the instance
    public static Logger getInstance(){
        if(logger == null){
            logger =new Logger();
        }
         return logger;
        
    }

    public void log(String s){
        System.out.println("Log: "+s);
    }
}

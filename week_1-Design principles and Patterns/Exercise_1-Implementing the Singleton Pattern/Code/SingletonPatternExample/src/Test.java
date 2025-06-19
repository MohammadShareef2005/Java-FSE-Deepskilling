public class Test {
    public static void main(String[] args) {

       Logger logger1= Logger.getInstance();
       logger1.log("First instances");


       Logger logger2= Logger.getInstance();
       logger2.log("Second instances");


       // Verifying both objects are same
       if (logger1==logger2){
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances! Singleton not working.");
        }
    }
    
}

public class LoggerTest {
    public static void main(String[] args) {
        // Get first instance of Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");
        
        // Try to get another instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");
        
        // Verify that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Success! Both logger instances are the same.");
        } else {
            System.out.println("Error! Different logger instances were created.");
        }
        
        // Print the hash codes to verify they are the same
        System.out.println("Logger1 hash code: " + logger1.hashCode());
        System.out.println("Logger2 hash code: " + logger2.hashCode());
    }
} 
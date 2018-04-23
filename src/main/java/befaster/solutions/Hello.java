package befaster.solutions;

public class Hello {
    public static String hello(String friendName) {
        if(friendName == null) {
            throw new IllegalArgumentException("Name must be provided");
        }
        
        return "Hello, " + friendName + "!";
    }
}
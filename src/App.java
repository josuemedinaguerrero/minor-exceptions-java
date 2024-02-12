import java.util.Arrays;
import java.util.NoSuchElementException;
// import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        // Optional<String> optstr = Arrays.asList("Java", "Angular", "Spring", "Node")
        //     .stream()
        //     .filter((str) -> str.startsWith("G"))
        //     .findFirst();
        
        // if (optstr.isPresent()) {
        //     String getValue = optstr.get();
        //     System.out.println(getValue);
        // }

        // String optstr = Arrays.asList("Java", "Angular", "Spring", "Node")
        //     .stream()
        //     .filter((str) -> str.startsWith("S"))
        //     .findFirst()
        //     .orElse("No course available");

        // String optstr = Arrays.asList("Java", "Angular", "Spring", "Node")
        //     .stream()
        //     .filter((str) -> str.startsWith("T"))
        //     .findFirst()
        //     .orElseGet(() -> "No course available");

        String optstr = Arrays.asList("Java", "Angular", "Spring", "Node")
            .stream()
            .filter((str) -> str.startsWith("T"))
            .findFirst()
            .orElseThrow(() -> new NoSuchElementException("Element not found!"));
        
        System.out.println(optstr);
    }   
}

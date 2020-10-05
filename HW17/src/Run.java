import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    public static void main(String[] args) {
        String text = "This field is trusted by the VM," +
                " and is a subject to constant folding if String instance is constant. " +
                "Overwriting this field after construction will cause problems.";
        Worker worker = new Worker(text);
        System.out.println( worker.countSymbol());
        System.out.println(worker.countWords());
       worker.replaceSymbol(3,'!');
        System.out.println(worker.getText());

    }
}

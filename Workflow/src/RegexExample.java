import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[abc]*");
        Matcher m = p.matcher("simod");
        boolean b = m.matches();

        boolean b1 = Pattern.compile(".as.").matcher("cast").matches();

        boolean b2  = Pattern.matches("[ap]", "p");

        System.out.println("Hi");
        System.out.println(b + " " + b1 + " " + b2);
    }
}


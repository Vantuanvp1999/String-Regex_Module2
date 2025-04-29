import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_GEREX = "^[CAP][0-9]{4}[GHIK]$";
    public ClassNameExample() {

    }
    public boolean validate(String email) {
        Pattern pattern = Pattern.compile(CLASS_GEREX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

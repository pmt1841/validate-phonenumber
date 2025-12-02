import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONENUMBER_REGEX = "[(][0-9]{2}[)]-[(]0[0-9]{9}[)]";

    public PhoneNumber() {
    }

    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTest {

    @Test
    void getPasswordTest() {
        System.out.println(Password.getPassword(10, 48, 122));

    }

    @Test
    void passwordTest() {
//        var expected = "";
        var actual = Password.getPassword(10,48,122);


        String stringPattern = "^[A-Za-z0-9]{5,10}$";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher("qyjEnTo3gv");
        boolean doesMatches = matcher.matches();

        assertTrue(doesMatches);
    }
}

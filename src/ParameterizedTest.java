
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.awt.datatransfer.StringSelection;

import static org.junit.jupiter.api.Assertions.*;
public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource (ints ={1,2,3,4})
    public void checkvalue(int number){
        assertTrue(number>0 && number<5);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"Java exercise", "junit tests", "digital house", "parameter"})
    public void checkForWhiteSpaces(String word){
        assertTrue(StringUtils.containsWhitespace(word));
    }






}

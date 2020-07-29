
import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    public void testisAnagram(){
        Main tester = new Main();
        assertEquals("anagrams", "anagrams", tester.isAnagram("bleat","table"));
        assertEquals("not anagrams", "not anagrams", tester.isAnagram("eat","tar"));

    }

}

package palindrome_java;
import static org.junit.Assert.*;  
import org.junit.Test;  
  
public class test_java { 
    @Test  
    public void testIsPalindrome(){  
        assertEquals(true,palindrome.isPalindrome("racecar"));  
        assertEquals(true,palindrome.isPalindrome("abba"));  
        assertEquals(false,palindrome.isPalindrome("abbaaa"));
    }  
}  


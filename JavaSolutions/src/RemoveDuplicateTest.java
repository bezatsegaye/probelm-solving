import org.junit.Test;

public class RemoveDuplicateTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
   public void removeDuplicates() {
       char [] result =  RemoveDuplicate
               .removeDuplicates(new char[]{'a','b','b','b','c','c','a','b'});
        org.junit.jupiter.api.Assertions.assertArrayEquals(new char[]{'a','b','c'}, result);
    }
}
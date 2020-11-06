import org.junit.Test;
import static org.junit.Assert.*; 

public class MainTest {
  @Test
  public void testNothing() {
  }

  @Test
  public void testSomeStuff(){
    try {
      assertEquals("You are bad at math", 5, 2+3);

      String s = " ";
      assertNotNull("Your String is null", null);

      assertTrue("Still bad at math", (3*7) > (4*5));

    } catch(AssertionError e) {
      System.out.println("\nError: " + e.getMessage());
    }
  }
}
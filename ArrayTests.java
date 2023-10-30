import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  /*
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,0};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{0,1}, input1);
	}
*/


  @Test
  public void testReversed() {
    int[] input1 = {5,4,2};
    assertArrayEquals(new int[]{2,4,5}, ArrayExamples.reversed(input1));
  }


}

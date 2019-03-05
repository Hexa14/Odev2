import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void test1() {
	  MessageQueue mq = mock(MessageQueue.class);
	   c = new Compute(mq);
	  when(c.mq.size()).thenReturn(0);
	  assertEquals(-1,c.countNumberOfOccurrences("asd"));
  }
  @Test
  public void test2() {
	  MessageQueue mq = mock(MessageQueue.class);
	   c = new Compute(mq);
	   String asd = "test";
	  when(c.mq.size()).thenReturn(1);
	  when(c.mq.contains(asd)).thenReturn(false);
	  assertEquals(0,c.countNumberOfOccurrences(asd));
	  
  }
}
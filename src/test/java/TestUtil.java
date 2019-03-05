import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void test1() {
	  int a[] = {10};
	  assertFalse(c.compute(a)); 
	  }
  @Test
  public void test2() {
	  int a[] = {10,5,7,1};
	  assertFalse(c.compute(a)); 
	  }
  @Test(expected = RuntimeException.class)
  public void test3() {
	  int a[] = {10,0,7};
	  c.compute(a);
	  }
}
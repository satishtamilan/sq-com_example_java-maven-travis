package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testAdd() throws Exception {
  	assertEquals(Foo.div(15, 5), 2);
  }
}

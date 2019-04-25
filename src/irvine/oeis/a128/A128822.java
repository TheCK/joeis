package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128822 Number of solutions to <code>x/3 + y/4 + z/6 &lt; n</code> with <code>x,y,z&gt;=1 </code>.
 * @author Sean A. Irvine
 */
public class A128822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128822() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 47, 206, 551});
  }
}

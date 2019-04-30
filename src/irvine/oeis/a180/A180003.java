package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180003 <code>a(n)</code> blue and b(n)(A180002) red balls in an urn, draw 5 balls without replacement, <code>Probability(5</code> red balls) <code>= Probability(3</code> red and 2 blue balls).
 * @author Sean A. Irvine
 */
public class A180003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180003() {
    super(new long[] {1, -1, 0, -38, 38, 0, 1}, new long[] {1, 2, 7, 13, 56, 247, 475});
  }
}

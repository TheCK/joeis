package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033106 Number of <code>6</code>'s when k is written in base b for all b and k satisfying <code>2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A033106 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033106() {
    super(new A033105());
  }
}

package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033094 Number of <code>0</code>'s when k is written in base b for all b and k satisfying <code>2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A033094 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033094() {
    super(new A033093());
  }
}

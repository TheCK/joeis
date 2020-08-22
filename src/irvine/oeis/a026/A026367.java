package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026367 a(n) = least k such that s(k) = n, where s = A026366.
 * @author Sean A. Irvine
 */
public class A026367 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026367() {
    super(new A026366());
  }
}

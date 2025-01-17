package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026371 a(n) = least k such that s(k) = n, where s = A026370.
 * @author Sean A. Irvine
 */
public class A026371 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026371() {
    super(new A026370());
  }
}

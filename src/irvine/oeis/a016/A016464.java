package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016464 Continued fraction for <code>log(36)</code>.
 * @author Sean A. Irvine
 */
public class A016464 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016464() {
    super(new A016659());
  }
}

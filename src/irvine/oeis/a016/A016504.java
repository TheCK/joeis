package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016504 Continued fraction for <code>log(76)</code>.
 * @author Sean A. Irvine
 */
public class A016504 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016504() {
    super(new A016699());
  }
}

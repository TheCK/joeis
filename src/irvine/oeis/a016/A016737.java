package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016737 Continued fraction for <code>log(9)</code>.
 * @author Sean A. Irvine
 */
public class A016737 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016737() {
    super(new A016632());
  }
}

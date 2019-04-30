package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016574 Continued fraction for <code>log(93/2)</code>.
 * @author Sean A. Irvine
 */
public class A016574 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016574() {
    super(new A016623());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016538 Continued fraction for <code>log(21/2)</code>.
 * @author Sean A. Irvine
 */
public class A016538 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016538() {
    super(new A016587());
  }
}

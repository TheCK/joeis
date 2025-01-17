package irvine.oeis.a007;

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a000.A000040;

/**
 * A007443 Binomial transform of primes.
 * @author Sean A. Irvine
 */
public class A007443 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A007443() {
    super(new A000040(), 0);
  }
}

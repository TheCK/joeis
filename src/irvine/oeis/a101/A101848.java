package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 360 10 -81 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A101848 Indices of primes in sequence defined by A(0) = 31, A(n) = 10*A(n-1) + 81 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101848 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101848() {
    super(1, 0, 360, 10, -81, 9);
  }
}

package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 1 520 10 -61 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A101584 Indices of primes in sequence defined by A(0) = 51, A(n) = 10*A(n-1) + 61 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101584 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101584() {
    super(1, 1, 520, 10, -61, 9);
  }
}

package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 650 10 61 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A101136 Indices of primes in sequence defined by <code>A(0) = 79, A(n) = 10*A(n-1) - 61</code> for <code>n &gt; 0</code>.
 * @author Georg Fischer
 */
public class A101136 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101136() {
    super(1, 0, 650, 10, 61, 9);
  }
}
package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 1 590 10 -23 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A101532 Indices of primes in sequence defined by <code>A(0) = 63, A(n) = 10*A(n-1) + 23</code> for <code>n &gt; 0</code>.
 * @author Georg Fischer
 */
public class A101532 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101532() {
    super(1, 1, 590, 10, -23, 9);
  }
}
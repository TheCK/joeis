package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 430 10 -61 9 at 2020-06-26 14:13
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;


/**
 * A101732 Indices of primes in sequence defined by <code>A(0) = 41, A(n) = 10*A(n-1) + 61</code> for <code>n &gt; 0</code>.
 * @author Georg Fischer
 */
public class A101732 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101732() {
    super(1, 0, 430, 10, -61, 9);
  }
}

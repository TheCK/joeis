package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 20 770 10 -41 9 at 2020-06-26 14:13
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;


/**
 * A101070 Indices of primes in sequence defined by <code>A(0) = 81, A(n) = 10*A(n-1) + 41</code> for <code>n &gt; 0</code>.
 * @author Georg Fischer
 */
public class A101070 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101070() {
    super(1, 20, 770, 10, -41, 9);
  }
}

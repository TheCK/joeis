package irvine.oeis.a056;
// Generated by gen_seq4.pl pfprime 5 310 10 -13 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A056253 Indices of primes in sequence defined by A(0) = 33, A(n) = 10*A(n-1) + 13 for n &gt; 0.
 * @author Georg Fischer
 */
public class A056253 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A056253() {
    super(1, 5, 310, 10, -13, 9);
  }
}

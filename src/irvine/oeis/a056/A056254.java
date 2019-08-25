package irvine.oeis.a056;
// Generated by gen_seq4.pl pfprime 1 320 10 -23 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A056254 Indices of primes in sequence defined by <code>A(0) = 33, A(n) = 10*A(n-1) + 23</code> for <code>n &gt; 0</code>.
 * @author Georg Fischer
 */
public class A056254 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A056254() {
    super(1, 1, 320, 10, -23, 9);
  }
}
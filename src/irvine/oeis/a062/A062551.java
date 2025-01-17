package irvine.oeis.a062;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimeSubsequence;


/**
 * A062551 Primes of the form 3*n! + 1.
 * @author Georg Fischer
 */
public class A062551 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A062551() {
    super(new AddConstantSequence(1, new HolonomicRecurrence(0, "[[0],[0, 1],[-1]]", "3", 0)), 0);
  }
}

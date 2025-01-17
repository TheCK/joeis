package irvine.oeis.a088;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimeSubsequence;


/**
 * A088332 Primes of the form k! + 1.
 * @author Georg Fischer
 */
public class A088332 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A088332() {
    super(new AddConstantSequence(1, new HolonomicRecurrence(0, "[[0],[0, 1],[-1]]", "1", 0)), 0);
    next();
  }
}

package irvine.oeis.a288;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimeSubsequence;


/**
 * A288881 Primes of the form k!3 + 3^5, where k!3 is the triple factorial number (A007661).
 * @author Georg Fischer
 */
public class A288881 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A288881() {
    super(new AddConstantSequence(243, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[-1]]", "1, 1, 2", 0)), 0);
  }
}

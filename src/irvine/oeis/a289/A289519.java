package irvine.oeis.a289;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimeSubsequence;


/**
 * A289519 Primes of the form k!4+128, where k!4 is the quadruple factorial number (A007662).
 * @author Georg Fischer
 */
public class A289519 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A289519() {
    super(new AddConstantSequence(128, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[-1]]", "1, 1, 2, 3", 0)), 0);
  }
}

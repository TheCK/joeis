package irvine.oeis.a180;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A180627 Numbers k such that 6*k! - 1 is prime.
 * @author Georg Fischer
 */
public class A180627 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A180627() {
    super(new AddConstantSequence(-1, new HolonomicRecurrence(0, "[[0],[0, 1],[-1]]", "6", 0)), 0);
  }
}

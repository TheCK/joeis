package irvine.oeis.a204;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A204657 Numbers n such that n!10 + 2 is prime.
 * @author Georg Fischer
 */
public class A204657 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A204657() {
    super(new AddConstantSequence(2, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5, 6, 7, 8, 9", 0)), 0);
  }
}

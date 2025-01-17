package irvine.oeis.a267;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A267029 Numbers n such that n!!! - 3^9 is prime, where n!3 = n!!! is a triple factorial number (A007661).
 * @author Georg Fischer
 */
public class A267029 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A267029() {
    super(new AddConstantSequence(-19683, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[-1]]", "1, 1, 2", 0)), 0);
  }
}

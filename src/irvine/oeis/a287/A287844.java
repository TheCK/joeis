package irvine.oeis.a287;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A287844 Numbers k such that k!6 + 3 is prime, where k!6 is the sextuple factorial number (A085158 ).
 * @author Georg Fischer
 */
public class A287844 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A287844() {
    super(new AddConstantSequence(3, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5", 0)), 0);
  }
}

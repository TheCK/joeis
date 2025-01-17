package irvine.oeis.a078;
// Generated by gen_seq4.pl prisubc at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.a004.A004154;


/**
 * A078305 Numbers n such that A004154(n) - 1 is prime.
 * @author Georg Fischer
 */
public class A078305 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A078305() {
    super(new AddConstantSequence(-1, new A004154()), 0);
  }

}

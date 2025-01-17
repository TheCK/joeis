package irvine.oeis.a288;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.prime.PrimeSubsequence;


/**
 * A288616 Primes of the form k!6+27, where k!6 is the sextuple factorial number (A085158).
 * @author Georg Fischer
 */
public class A288616 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A288616() {
    super(new AddConstantSequence(27, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5", 0)), 0);
  }
}

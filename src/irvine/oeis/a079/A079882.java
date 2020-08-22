package irvine.oeis.a079;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a080.A080637;

/**
 * A079882 A run of 2^n 1's followed by a run of 2^n 2's, for n=0, 1, 2, ...
 * @author Georg Fischer
 */
public class A079882 extends DifferenceSequence {

  /** Construct the sequence. */
  public A079882() {
    super(new A080637());
  }
}

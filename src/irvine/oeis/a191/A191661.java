package irvine.oeis.a191;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000219;

/**
 * A191661 Third differences of A000219.
 * @author Georg Fischer
 */
public class A191661 extends DifferenceSequence {

  /** Construct the sequence. */
  public A191661() {
    super(new DifferenceSequence(new DifferenceSequence(new A000219())));
  }
}

package irvine.oeis.a245;
// Generated by gen_seq4.pl diffseq at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a038.A038580;

/**
 * A245175 Second differences of A038580.
 *
 * @author Georg Fischer
 */
public class A245175 extends DifferenceSequence {

  /** Construct the sequence. */
  public A245175() {
    super(new DifferenceSequence(new A038580()));
  }
}

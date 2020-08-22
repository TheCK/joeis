package irvine.oeis.a134;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a006.A006336;

/**
 * A134409 Second differences of A006336.
 * @author Georg Fischer
 */
public class A134409 extends DifferenceSequence {

  /** Construct the sequence. */
  public A134409() {
    super(new DifferenceSequence(new A006336()));
  }
}

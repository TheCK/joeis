package irvine.oeis.a191;
// Generated by gen_seq4.pl serrevpa at 2021-05-02 19:34
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;
import irvine.oeis.transform.RevertTransformSequence;


/**
 * A191242 Reversion of x-x^2-x^3-2*x^4.
 * @author Georg Fischer
 */
public class A191242 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A191242() {
    super(new PaddingSequence(new long[]{1, -1, -1, -2}, new long[]{0}));
  }
}

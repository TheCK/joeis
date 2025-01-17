package irvine.oeis.a131;
// Generated by gen_seq4.pl serrevgf at 2021-05-02 19:34
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;
import irvine.oeis.transform.RevertTransformSequence;


/**
 * A131763 Series reversion of x(1-4x)/(1-x).
 * @author Georg Fischer
 */
public class A131763 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A131763() {
    super(new GeneratingFunctionSequence(new long[]{1, -4}, new long[]{1, -1}));
  }
}

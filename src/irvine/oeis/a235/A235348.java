package irvine.oeis.a235;
// Generated by gen_seq4.pl serrevgf at 2021-05-02 19:34
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;
import irvine.oeis.transform.RevertTransformSequence;


/**
 * A235348 Series reversion of x*(1-2*x-5*x^2)/(1-x^2).
 * @author Georg Fischer
 */
public class A235348 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A235348() {
    super(new GeneratingFunctionSequence(new long[]{+1, -2, -5}, new long[]{1, +0, -1}));
  }
}

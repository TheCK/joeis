package irvine.oeis.a261;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A261650 Expansion of Product_{k&gt;=0} ((1+x^(4*k+1))/(1-x^(4*k+1)))^2.
 * @author Georg Fischer
 */
public class A261650 extends EulerTransform {

  /** Construct the sequence. */
  public A261650() {
    super(new PaddingSequence(new long[] {  }, new long[] {4, -2, 0, 0, 4, 0, 0, 0}), 1);
  }
}

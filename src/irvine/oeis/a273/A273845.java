package irvine.oeis.a273;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A273845 Expansion of Product_{n&gt;=1} (1 - x^(3*n))/(1 - x^n)^3 in powers of x.
 * @author Georg Fischer
 */
public class A273845 extends EulerTransform {

  /** Construct the sequence. */
  public A273845() {
    super(new PaddingSequence(new long[] {  }, new long[] {3, 3, 2}), 1);
  }
}

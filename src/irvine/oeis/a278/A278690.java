package irvine.oeis.a278;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A278690 Expansion of Product_{n&gt;=1} (1 - x^(3*n))/(1 - x^n)^2 in powers of x.
 * @author Georg Fischer
 */
public class A278690 extends EulerTransform {

  /** Construct the sequence. */
  public A278690() {
    super(new PaddingSequence(new long[] {  }, new long[] {2, 2, 1}), 1);
  }
}

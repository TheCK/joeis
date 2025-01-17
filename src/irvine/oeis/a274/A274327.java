package irvine.oeis.a274;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A274327 Expansion of Product_{n&gt;=1} (1 - x^(4*n))/(1 - x^n)^4 in powers of x.
 * @author Georg Fischer
 */
public class A274327 extends EulerTransform {

  /** Construct the sequence. */
  public A274327() {
    super(new PaddingSequence(new long[] {  }, new long[] {4, 4, 4, 3}), 1);
  }
}

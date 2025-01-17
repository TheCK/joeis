package irvine.oeis.a282;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A282927 Expansion of Product_{k&gt;=1} (1 - x^(7*k))^36/(1 - x^k)^37 in powers of x.
 * @author Georg Fischer
 */
public class A282927 extends EulerTransform {

  /** Construct the sequence. */
  public A282927() {
    super(new PaddingSequence(new long[] {  }, new long[] {37, 37, 37, 37, 37, 37, 1}), 1);
  }
}

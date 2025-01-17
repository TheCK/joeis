package irvine.oeis.a280;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A280874 Expansion of Product_{k&gt;=1} (1 - x^(6*k)) * (1 + x^k) / (1 - x^k).
 * @author Georg Fischer
 */
public class A280874 extends EulerTransform {

  /** Construct the sequence. */
  public A280874() {
    super(new PaddingSequence(new long[] {  }, new long[] {2, 1, 2, 1, 2, 0}), 1);
  }
}

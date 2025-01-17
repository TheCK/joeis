package irvine.oeis.a304;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A304630 Expansion of (1/(1 - x))*Product_{k&gt;=1} (1 - x^(3*k))/(1 - x^k).
 * @author Georg Fischer
 */
public class A304630 extends EulerTransform {

  /** Construct the sequence. */
  public A304630() {
    super(new PaddingSequence(new long[] {2}, new long[] {1, 1, 0}), 1);
  }
}

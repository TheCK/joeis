package irvine.oeis.a293;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A293389 Expansion of ((eta(q)eta(q^3))/eta(q^2)^2)^2 in powers of q.
 * @author Georg Fischer
 */
public class A293389 extends EulerTransform {

  /** Construct the sequence. */
  public A293389() {
    super(new PaddingSequence(new long[] {  }, new long[] {-2, 2, -4, 2, -2, 0}), 1);
  }
}

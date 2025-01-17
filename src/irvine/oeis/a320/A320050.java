package irvine.oeis.a320;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A320050 Expansion of (psi(x) / phi(x))^7 in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A320050 extends EulerTransform {

  /** Construct the sequence. */
  public A320050() {
    super(new PaddingSequence(new long[] {  }, new long[] {-7, 14, -7, 0}), 1);
  }
}

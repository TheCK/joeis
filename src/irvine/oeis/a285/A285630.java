package irvine.oeis.a285;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A285630 Expansion of r(q)^5 / r(q^5) in powers of q where r() is the Rogers-Ramanujan continued fraction.
 * @author Georg Fischer
 */
public class A285630 extends EulerTransform {

  /** Construct the sequence. */
  public A285630() {
    super(new PaddingSequence(new long[] {  }, new long[] {-5, 5, 5, -5, 1, -5, 5, 5, -5, -1, -5, 5, 5, -5, -1, -5, 5, 5, -5, 1, -5, 5, 5, -5, 0}), 1);
  }
}

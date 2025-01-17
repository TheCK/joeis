package irvine.oeis.a285;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A285444 Expansion of Product_{k&gt;0} ((1-x^{5k-2}) * (1-x^{5k-3})/((1-x^{5k-1}) * (1-x^{5k-4})))^4 in powers of x.
 * @author Georg Fischer
 */
public class A285444 extends EulerTransform {

  /** Construct the sequence. */
  public A285444() {
    super(new PaddingSequence(new long[] {  }, new long[] {4, -4, -4, 4, 0}), 1);
  }
}

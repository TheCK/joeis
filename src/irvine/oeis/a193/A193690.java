package irvine.oeis.a193;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.FiniteSequence;


/**
 * A193690 Expansion of (1 - x^2)^2 * (1 - x^4) / ((1 - x)^2 * (1 - x^6)) in powers of x.
 * @author Georg Fischer
 */
public class A193690 extends EulerTransform {

  /** Construct the sequence. */
  public A193690() {
    super(new FiniteSequence(2, -2, 0, -1, 0, 1), 1);
  }
}

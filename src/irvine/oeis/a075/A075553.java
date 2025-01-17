package irvine.oeis.a075;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.FiniteSequence;


/**
 * A075553 Numerators in the Maclaurin series for arctan(1+x).
 * @author Georg Fischer
 */
public class A075553 extends EulerTransform {

  /** Construct the sequence. */
  public A075553() {
    super(new FiniteSequence(-1, 1, 1, -1, 0, -1, 0, 1), 0, 1);
  }
}

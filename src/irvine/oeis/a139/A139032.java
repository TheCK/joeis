package irvine.oeis.a139;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A139032 Expansion of 1 + c(q^6) / c(q^3) where c() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A139032 extends EulerTransform {

  /** Construct the sequence. */
  public A139032() {
    super(new PeriodicSequence(1, -1, 0, -1, 1, -1, 1, -1, 2, -1, 1, -1, 1, -1, 0, -1, 1, 0), 1);
  }
}

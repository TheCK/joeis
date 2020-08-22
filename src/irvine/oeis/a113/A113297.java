package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113297 Expansion of chi(-q) / chi(-q^7) in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A113297 extends EulerTransform {

  /** Construct the sequence. */
  public A113297() {
    super(new PeriodicSequence(-1, 0, -1, 0, -1, 0, 0, 0, -1, 0, -1, 0, -1, 0), 1);
  }
}

package irvine.oeis.a244;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A244339 Expansion of (-2 * a(q) + 3*a(q^2) + 2*a(q^4)) / 3 in powers of q where a() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A244339 extends EulerTransform {

  /** Construct the sequence. */
  public A244339() {
    super(new PeriodicSequence(-4, 0, 0, -1, -4, -4, -4, -1, 0, 0, -4, -2), 1);
  }
}

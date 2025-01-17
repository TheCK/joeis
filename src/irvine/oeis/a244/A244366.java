package irvine.oeis.a244;
// Generated by gen_seq4.pl eulerxfm 2 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A244366 Expansion of c(q) * c(q^5) / 9 in powers of q where c() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A244366 extends EulerTransform {

  /** Construct the sequence. */
  public A244366() {
    super(new PeriodicSequence(1, 1, -2, 1, 2, -2, 1, 1, -2, 2, 1, -2, 1, 1, -4), 1);
  }
}

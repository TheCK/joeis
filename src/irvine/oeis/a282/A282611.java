package irvine.oeis.a282;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A282611 Expansion of q^(-1/3) * c(q) * c(q^3) / 9 in powers of q where c() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A282611 extends EulerTransform {

  /** Construct the sequence. */
  public A282611() {
    super(new PeriodicSequence(1, 1, -1, 1, 1, -1, 1, 1, -4), 0, 1);
  }
}

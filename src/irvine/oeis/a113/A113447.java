package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113447 Expansion of i * theta_2(i * q^3)^3 / (4 * theta_2(i * q)) in powers of q^2.
 * @author Georg Fischer
 */
public class A113447 extends EulerTransform {

  /** Construct the sequence. */
  public A113447() {
    super(new PeriodicSequence(1, 0, -2, 1, 1, 0, 1, 1, -2, 0, 1, -2), 1);
  }
}

package irvine.oeis.a192;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A192329 Expansion of q^(-1/3) * (eta(q) * eta(q^9))^2 / eta(q^3)^4 in powers of q.
 * @author Georg Fischer
 */
public class A192329 extends EulerTransform {

  /** Construct the sequence. */
  public A192329() {
    super(new PeriodicSequence(-2, -2, 2, -2, -2, 2, -2, -2, 0), 1);
  }
}

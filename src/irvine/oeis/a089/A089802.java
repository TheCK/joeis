package irvine.oeis.a089;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A089802 Expansion of q^(-1/3) * (theta_4(q^3) - theta_4(q^(1/3))) / 2 in powers of q.
 * @author Georg Fischer
 */
public class A089802 extends EulerTransform {

  /** Construct the sequence. */
  public A089802() {
    super(new PeriodicSequence(-1, 0, 0, 0, -1, -1), 1);
  }
}

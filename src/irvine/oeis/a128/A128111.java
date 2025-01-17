package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128111 Expansion of q^(-1) * (phi(q) / phi(q^9) - 1) / 2 in powers of q^3 where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A128111 extends EulerTransform {

  /** Construct the sequence. */
  public A128111() {
    super(new PeriodicSequence(1, -1, -2, 0, 1, 2, 1, 0, -2, -1, 1, 0), 1);
  }
}

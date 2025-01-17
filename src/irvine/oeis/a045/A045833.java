package irvine.oeis.a045;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A045833 Expansion of eta(q^9)^3 / eta(q^3) in powers of q.
 * @author Georg Fischer
 */
public class A045833 extends EulerTransform {

  /** Construct the sequence. */
  public A045833() {
    super(new PeriodicSequence(0, 0, 1, 0, 0, 1, 0, 0, -2), 0, 1);
  }
}

package irvine.oeis.a329;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A329956 Expansion of q^(-1/3) * eta(q)^3 * eta(q^3) * eta(q^6) / eta(q^2)^2 in powers of q.
 * @author Georg Fischer
 */
public class A329956 extends EulerTransform {

  /** Construct the sequence. */
  public A329956() {
    super(new PeriodicSequence(-3, -1, -4, -1, -3, -3), 1);
  }
}

package irvine.oeis.a187;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A187427 Expansion of q^(3/8) * eta(q)^3 / eta(q^3)^4 in powers of q.
 * @author Georg Fischer
 */
public class A187427 extends EulerTransform {

  /** Construct the sequence. */
  public A187427() {
    super(new PeriodicSequence(-3, -3, 1), 1);
  }
}

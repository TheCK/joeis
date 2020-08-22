package irvine.oeis.a097;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A097197 Expansion of q^(-1/3) * eta(q^6)^2 / (eta(q) * eta(q^3)) in powers of q.
 * @author Georg Fischer
 */
public class A097197 extends EulerTransform {

  /** Construct the sequence. */
  public A097197() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 0), 1);
  }
}

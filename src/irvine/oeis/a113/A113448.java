package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113448 Expansion of (eta(q^2)^2 * eta(q^9) * eta(q^18)) / (eta(q) * eta(q^6)) in powers of q.
 * @author Georg Fischer
 */
public class A113448 extends EulerTransform {

  /** Construct the sequence. */
  public A113448() {
    super(new PeriodicSequence(1, -1, 1, -1, 1, 0, 1, -1, 0, -1, 1, 0, 1, -1, 1, -1, 1, -2), 1);
  }
}

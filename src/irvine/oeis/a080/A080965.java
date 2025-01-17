package irvine.oeis.a080;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A080965 Expansion of eta(q^2)^12/(eta(q)^4eta(q^4)^5) in powers of q.
 * @author Georg Fischer
 */
public class A080965 extends EulerTransform {

  /** Construct the sequence. */
  public A080965() {
    super(new PeriodicSequence(4, -8, 4, -3), 1);
  }
}

package irvine.oeis.a245;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A245436 Expansion of q^(-1) * (f(-q^3, -q^5) / f(-q, -q^7))^2 in powers of x where f(,) is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A245436 extends EulerTransform {

  /** Construct the sequence. */
  public A245436() {
    super(new PeriodicSequence(2, 0, -2, 0, -2, 0, 2, 0), 1);
  }
}

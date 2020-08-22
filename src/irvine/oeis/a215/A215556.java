package irvine.oeis.a215;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A215556 Expansion of q * psi(-q) * phi(q) * psi(-q^7) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A215556 extends EulerTransform {

  /** Construct the sequence. */
  public A215556() {
    super(new PeriodicSequence(1, -3, 1, -2, 1, -3, 0, -2, 1, -3, 1, -2, 1, -3, 1, -2, 1, -3, 1, -2, 0, -3, 1, -2, 1, -3, 1, -3), 1);
  }
}

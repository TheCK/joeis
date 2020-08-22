package irvine.oeis.a134;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A134013 Expansion of q * phi(q) * psi(q^8) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A134013 extends EulerTransform {

  /** Construct the sequence. */
  public A134013() {
    super(new PeriodicSequence(2, -3, 2, -1, 2, -3, 2, 0, 2, -3, 2, -1, 2, -3, 2, -2), 1);
  }
}

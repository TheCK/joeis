package irvine.oeis.a124;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A124815 Expansion of q * psi(q)^2 * psi(-q^3)^2 * phi(-q^6) / phi(-q^2) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A124815 extends EulerTransform {

  /** Construct the sequence. */
  public A124815() {
    super(new PeriodicSequence(2, 0, 0, -1, 2, -2, 2, -1, 0, 0, 2, -4), 1);
  }
}

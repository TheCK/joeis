package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226350 Expansion of psi(x) * psi(-x^3) in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A226350 extends EulerTransform {

  /** Construct the sequence. */
  public A226350() {
    super(new PeriodicSequence(1, -1, 0, -1, 1, -1, 1, -1, 0, -1, 1, -2), 1);
  }
}

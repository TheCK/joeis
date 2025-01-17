package irvine.oeis.a121;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A121456 Expansion of q*(psi(-q)psi(-q^3))^2 in powers of q where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A121456 extends EulerTransform {

  /** Construct the sequence. */
  public A121456() {
    super(new PeriodicSequence(-2, 0, -4, -2, -2, 0, -2, -2, -4, 0, -2, -4), 1);
  }
}

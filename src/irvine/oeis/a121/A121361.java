package irvine.oeis.a121;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A121361 Expansion of f(x^1, x^5) * psi(x^2) in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A121361 extends EulerTransform {

  /** Construct the sequence. */
  public A121361() {
    super(new PeriodicSequence(1, 0, 0, -1, 1, 0, 1, -1, 0, 0, 1, -2), 1);
  }
}

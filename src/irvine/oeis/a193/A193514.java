package irvine.oeis.a193;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A193514 Expansion of phi(-q)^2 * phi(-q^9) / phi(-q^3) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A193514 extends EulerTransform {

  /** Construct the sequence. */
  public A193514() {
    super(new PeriodicSequence(-4, -2, -2, -2, -4, -1, -4, -2, -4, -2, -4, -1, -4, -2, -2, -2, -4, -2), 1);
  }
}

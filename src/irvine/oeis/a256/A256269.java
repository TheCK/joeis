package irvine.oeis.a256;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A256269 Expansion of psi(-q) * chi(q^3) * phi(q^9) in powers of q where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A256269 extends EulerTransform {

  /** Construct the sequence. */
  public A256269() {
    super(new PeriodicSequence(-1, 0, 0, -1, -1, -1, -1, -1, 2, 0, -1, -1, -1, 0, 0, -1, -1, -4, -1, -1, 0, 0, -1, -1, -1, 0, 2, -1, -1, -1, -1, -1, 0, 0, -1, -2), 1);
  }
}

package irvine.oeis.a124;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A124452 Expansion of psi(-q) * psi(-q^2) * chi(q^3) * chi(q^6) in powers of q where psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A124452 extends EulerTransform {

  /** Construct the sequence. */
  public A124452() {
    super(new PeriodicSequence(-1, -1, 0, -1, -1, -1, -1, -2, 0, -1, -1, -2, -1, -1, 0, -2, -1, -1, -1, -1, 0, -1, -1, -2), 1);
  }
}

package irvine.oeis.a092;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A092876 Expansion of q * (f(-q, -q^12) * f(-q^3, -q^10) * f(-q^4, -q^9)) / (f(-q^2, -q^11) * f(-q^5, -q^8) * f(-q^6, -q^7)) in powers of q where f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A092876 extends EulerTransform {

  /** Construct the sequence. */
  public A092876() {
    super(new PeriodicSequence(-1, 1, -1, -1, 1, 1, 1, 1, -1, -1, 1, -1, 0), 1);
  }
}

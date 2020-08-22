package irvine.oeis.a092;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A092872 Expansion of r(q^9) / (r(q) r(q^3)) in powers of q where r() is the Rogers-Ramanujan continued fraction function (A007325).
 * @author Georg Fischer
 */
public class A092872 extends EulerTransform {

  /** Construct the sequence. */
  public A092872() {
    super(new PeriodicSequence(1, -1, 0, 1, 0, 0, -1, -1, -1, 0, 1, 0, -1, 1, 0, 1, -1, 1, 1, 0, 0, -1, -1, 0, 0, 1, 1, -1, 1, 0, 1, -1, 0, 1, 0, -1, -1, -1, 0, 0, 1, 0, -1, 1, 0), 1);
  }
}

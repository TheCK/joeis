package irvine.oeis.a112;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A112298 Expansion of (a(q) - 3*a(q^2) + 2*a(q^4)) / 6 in powers of q where a() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A112298 extends EulerTransform {

  /** Construct the sequence. */
  public A112298() {
    super(new PeriodicSequence(-3, -2, -2, -1, -3, 0, -3, -1, -2, -2, -3, -2), 1);
  }
}

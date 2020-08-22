package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226132 Expansion of - c(-q) * c(q^2) / 9 in powers of q where c() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A226132 extends EulerTransform {

  /** Construct the sequence. */
  public A226132() {
    super(new PeriodicSequence(-1, 3, 2, 2, -1, -6, -1, 2, 2, 3, -1, -4), 1);
  }
}

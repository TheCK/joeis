package irvine.oeis.a242;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A242405 Expansion of (b(q) / b(q^2))^2 in powers of q where b() is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A242405 extends EulerTransform {

  /** Construct the sequence. */
  public A242405() {
    super(new PeriodicSequence(-6, 0, -4, 0, -6, 0), 1);
  }
}

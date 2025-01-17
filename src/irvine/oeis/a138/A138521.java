package irvine.oeis.a138;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A138521 Expansion of chi(-q)^5 / chi(-q^5) in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A138521 extends EulerTransform {

  /** Construct the sequence. */
  public A138521() {
    super(new PeriodicSequence(-5, 0, -5, 0, -4, 0, -5, 0, -5, 0), 1);
  }
}

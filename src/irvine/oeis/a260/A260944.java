package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260944 Expansion of phi(-x^4) * psi(-x^6) / chi(-x^3) in powers of q where phi(), psi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260944 extends EulerTransform {

  /** Construct the sequence. */
  public A260944() {
    super(new PeriodicSequence(0, 0, 1, -2, 0, -1, 0, -1, 1, 0, 0, -2, 0, 0, 1, -1, 0, -1, 0, -2, 1, 0, 0, -2), 1);
  }
}

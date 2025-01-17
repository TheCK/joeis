package irvine.oeis.a143;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A143323 Expansion of eta(q^2)^4 * eta(q^5) * eta(q^20)^2 / ( eta(q) * eta(q^4)^2 * eta(q^10)^2 ) in powers of q.
 * @author Georg Fischer
 */
public class A143323 extends EulerTransform {

  /** Construct the sequence. */
  public A143323() {
    super(new PeriodicSequence(1, -3, 1, -1, 0, -3, 1, -1, 1, -2, 1, -1, 1, -3, 0, -1, 1, -3, 1, -2), 1);
  }
}

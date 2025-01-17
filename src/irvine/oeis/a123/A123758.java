package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A123758 Expansion of q^(-1/3)*eta(q)*eta(q^4)*eta(q^5)/eta(q^2) in powers of q.
 * @author Georg Fischer
 */
public class A123758 extends EulerTransform {

  /** Construct the sequence. */
  public A123758() {
    super(new PeriodicSequence(-1, 0, -1, -1, -2, 0, -1, -1, -1, -1, -1, -1, -1, 0, -2, -1, -1, 0, -1, -2), 1);
  }
}

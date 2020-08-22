package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A123648 Expansion of eta(q^4) * eta(q^28) / (eta(q) * eta(q^7)) in powers of q.
 * @author Georg Fischer
 */
public class A123648 extends EulerTransform {

  /** Construct the sequence. */
  public A123648() {
    super(new PeriodicSequence(1, 1, 1, 0, 1, 1, 2, 0, 1, 1, 1, 0, 1, 2, 1, 0, 1, 1, 1, 0, 2, 1, 1, 0, 1, 1, 1, 0), 1);
  }
}

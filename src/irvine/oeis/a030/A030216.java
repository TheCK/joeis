package irvine.oeis.a030;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A030216 Expansion of q^-1 * eta(q^10) * eta(q^14) in powers of q^2.
 * @author Georg Fischer
 */
public class A030216 extends EulerTransform {

  /** Construct the sequence. */
  public A030216() {
    super(new PeriodicSequence(0, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, -1, -1, 0, 0, 0, 0, -1, -1, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, -2), 1);
  }
}

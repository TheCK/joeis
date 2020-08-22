package irvine.oeis.a121;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A121593 Expansion of (eta(q^7) / eta(q))^4 in powers of q.
 * @author Georg Fischer
 */
public class A121593 extends EulerTransform {

  /** Construct the sequence. */
  public A121593() {
    super(new PeriodicSequence(4, 4, 4, 4, 4, 4, 0), 1);
  }
}

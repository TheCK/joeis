package irvine.oeis.a121;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A121590 Expansion of (eta(q^3) / eta(q))^12 in powers of q.
 * @author Georg Fischer
 */
public class A121590 extends EulerTransform {

  /** Construct the sequence. */
  public A121590() {
    super(new PeriodicSequence(12, 12, 0), 1);
  }
}

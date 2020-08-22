package irvine.oeis.a030;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A030203 Expansion of q^(-1/6) * eta(q) * eta(q^3) in powers of q.
 * @author Georg Fischer
 */
public class A030203 extends EulerTransform {

  /** Construct the sequence. */
  public A030203() {
    super(new PeriodicSequence(-1, -1, -2), 1);
  }
}

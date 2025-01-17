package irvine.oeis.a092;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A092877 Expansion of (eta(q^4) / eta(q))^8 in powers of q.
 * @author Georg Fischer
 */
public class A092877 extends EulerTransform {

  /** Construct the sequence. */
  public A092877() {
    super(new PeriodicSequence(8, 8, 8, 0), 1);
  }
}

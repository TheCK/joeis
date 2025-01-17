package irvine.oeis.a014;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A014103 Expansion of (eta(q^2) / eta(q))^24 in powers of q.
 * @author Georg Fischer
 */
public class A014103 extends EulerTransform {

  /** Construct the sequence. */
  public A014103() {
    super(new PeriodicSequence(24, 0, 24, 0), 1);
  }
}

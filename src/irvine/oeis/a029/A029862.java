package irvine.oeis.a029;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A029862 Expansion of q^(5/24) / (eta(q) * eta(q^2)^2) in powers of q.
 * @author Georg Fischer
 */
public class A029862 extends EulerTransform {

  /** Construct the sequence. */
  public A029862() {
    super(new PeriodicSequence(1, 3), 1);
  }
}

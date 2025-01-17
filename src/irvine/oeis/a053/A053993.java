package irvine.oeis.a053;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A053993 The number phi_2(n) of Frobenius partitions that allow up to 2 repetitions of an integer in a row.
 * @author Georg Fischer
 */
public class A053993 extends EulerTransform {

  /** Construct the sequence. */
  public A053993() {
    super(new PeriodicSequence(1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1), 1);
  }
}

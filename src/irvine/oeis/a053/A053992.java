package irvine.oeis.a053;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A053992 The number phi_3(n) of Frobenius partitions that allow up to 3 repetitions of an integer in a row.
 * @author Georg Fischer
 */
public class A053992 extends EulerTransform {

  /** Construct the sequence. */
  public A053992() {
    super(new PeriodicSequence(1, 2, 3, 2, 1, -1, 1, 2, 3, 2, 1, 1), 1);
  }
}

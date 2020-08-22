package irvine.oeis.a058;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A058695 Number of ways to partition 2n+1 into positive integers.
 * @author Georg Fischer
 */
public class A058695 extends EulerTransform {

  /** Construct the sequence. */
  public A058695() {
    super(new PeriodicSequence(3, 1, 2, 2, 2, 2, 3, 1, 3, 2, 2, 2, 2, 1, 3, 1), 1);
  }
}

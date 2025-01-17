package irvine.oeis.a225;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A225197 Number of 7-line partitions of n (i.e., planar partitions of n with at most 7 lines).
 * @author Georg Fischer
 */
public class A225197 extends EulerTransform {

  /** Construct the sequence. */
  public A225197() {
    super(new PaddingSequence(new long[] {1, 2, 3, 4, 5, 6}, new long[] {7}), 1);
  }
}

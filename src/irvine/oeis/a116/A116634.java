package irvine.oeis.a116;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A116634 Number of partitions of n having exactly one part that is a multiple of 3.
 * @author Georg Fischer
 */
public class A116634 extends EulerTransform {

  /** Construct the sequence. */
  public A116634() {
    super(new PaddingSequence(new long[] {1, 1, 1}, new long[] {1, 1, 0}), 0, 0, 0, 1);
  }
}

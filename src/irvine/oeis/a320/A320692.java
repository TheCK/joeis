package irvine.oeis.a320;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A320692 Number of partitions of n with up to five distinct kinds of 1.
 * @author Georg Fischer
 */
public class A320692 extends EulerTransform {

  /** Construct the sequence. */
  public A320692() {
    super(new PaddingSequence(new long[] {5, -4}, new long[] {1}), 1);
  }
}

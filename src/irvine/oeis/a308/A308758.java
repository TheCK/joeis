package irvine.oeis.a308;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A308758 Sum of the third largest parts of the partitions of n into 4 parts.
 * @author Georg Fischer
 */
public class A308758 extends EulerTransform {

  /** Construct the sequence. */
  public A308758() {
    super(new PaddingSequence(new long[] {1, 1, 2, 2, 0, 0, -1}, new long[] {0}), 0, 0, 0, 0, 1);
  }
}

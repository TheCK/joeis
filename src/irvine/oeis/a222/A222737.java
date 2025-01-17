package irvine.oeis.a222;
// Generated by gen_seq4.pl eulerxfm 9 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A222737 Total sum of parts of multiplicity 9 in all partitions of n.
 * @author Georg Fischer
 */
public class A222737 extends EulerTransform {

  /** Construct the sequence. */
  public A222737() {
    super(new PaddingSequence(new long[] {0, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new long[] {1}), 1);
  }
}

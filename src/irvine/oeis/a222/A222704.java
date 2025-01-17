package irvine.oeis.a222;
// Generated by gen_seq4.pl eulerxfm 4 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A222704 Total number of parts of multiplicity 4 in all partitions of n.
 * @author Georg Fischer
 */
public class A222704 extends EulerTransform {

  /** Construct the sequence. */
  public A222704() {
    super(new PaddingSequence(new long[] {0, 1, 1, 2, 2}, new long[] {1}), 1);
  }
}

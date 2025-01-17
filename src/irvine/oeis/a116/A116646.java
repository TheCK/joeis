package irvine.oeis.a116;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A116646 Number of doubletons in all partitions of n. By a doubleton in a partition we mean an occurrence of a part exactly twice (the partition [4,(3,3),2,2,2,(1,1)] has two doubletons, shown between parentheses).
 * @author Georg Fischer
 */
public class A116646 extends EulerTransform {

  /** Construct the sequence. */
  public A116646() {
    super(new PaddingSequence(new long[] {0, 2, 2}, new long[] {1}), 0, 0, 1);
  }
}

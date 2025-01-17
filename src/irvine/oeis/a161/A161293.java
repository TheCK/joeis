package irvine.oeis.a161;
// Generated by gen_seq4.pl eulerper 0 24 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0 at 2020-03-06 22:01
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A161293 Number of partitions of n into numbers not divisible by 4 where every part appears at least 2 times.
 * @author Georg Fischer
 */
public class A161293 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A161293() {
    super(new PeriodicSequence(0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0), 0);
  }
}

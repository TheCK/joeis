package irvine.oeis.a036;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A036019 Number of partitions of n into parts not of form 4k+2, 12k, 12k+5 or 12k-5.
 * @author Georg Fischer
 */
public class A036019 extends EulerTransform {

  /** Construct the sequence. */
  public A036019() {
    super(new PeriodicSequence(1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0), 1);
  }
}

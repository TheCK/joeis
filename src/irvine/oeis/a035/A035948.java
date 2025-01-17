package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035948 Number of partitions of n into parts not of the form 11k, 11k+5 or 11k-5. Also number of partitions with at most 4 parts of size 1 and differences between parts at distance 4 are greater than 1.
 * @author Georg Fischer
 */
public class A035948 extends EulerTransform {

  /** Construct the sequence. */
  public A035948() {
    super(new PeriodicSequence(1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0), 1);
  }
}

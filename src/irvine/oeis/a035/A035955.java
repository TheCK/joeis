package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 1 2 at 2020-09-12 00:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035955 Number of partitions in parts not of the form 15k, 15k+1 or 15k-1. Also number of partitions with no part of size 1 and differences between parts at distance 6 are greater than 1.
 * @author Georg Fischer
 */
public class A035955 extends EulerTransform {

  /** Construct the sequence. */
  public A035955() {
    super(new PeriodicSequence(0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0), new Z[0]);
  }
}

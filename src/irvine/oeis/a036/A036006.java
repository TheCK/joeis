package irvine.oeis.a036;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A036006 Number of partitions of n into parts not of the form 25k, 25k+7 or 25k-7. Also number of partitions with at most 6 parts of size 1 and differences between parts at distance 11 are greater than 1.
 * @author Georg Fischer
 */
public class A036006 extends EulerTransform {

  /** Construct the sequence. */
  public A036006() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0), new Z[0]);
  }
}

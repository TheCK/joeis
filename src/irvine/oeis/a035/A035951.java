package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 1 2 at 2020-09-12 00:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035951 Number of partitions in parts not of the form 13k, 13k+3 or 13k-3. Also number of partitions with at most 2 parts of size 1 and differences between parts at distance 5 are greater than 1.
 * @author Georg Fischer
 */
public class A035951 extends EulerTransform {

  /** Construct the sequence. */
  public A035951() {
    super(new PeriodicSequence(1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0), new Z[0]);
  }
}

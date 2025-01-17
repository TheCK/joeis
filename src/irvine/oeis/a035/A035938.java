package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035938 Number of partitions in parts not of the form 7k, 7k+2 or 7k-2. Also number of partitions with 1 part of size 1 and differences between parts at distance 2 are greater than 1.
 * @author Georg Fischer
 */
public class A035938 extends EulerTransform {

  /** Construct the sequence. */
  public A035938() {
    super(new PeriodicSequence(1, 0, 1, 1, 0, 1, 0), 1);
  }
}

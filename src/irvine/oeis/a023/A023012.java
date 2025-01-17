package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010853;

/**
 * A023012 Number of partitions of n into parts of 14 kinds.
 * @author Sean A. Irvine
 */
public class A023012 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023012() {
    super(new A010853(), 0);
  }
}

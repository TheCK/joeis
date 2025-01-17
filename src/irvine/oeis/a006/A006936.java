package irvine.oeis.a006;

import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.a000.A000670;

/**
 * A006936 Moebius transform of numbers of preferential arrangements.
 * @author Sean A. Irvine
 */
public class A006936 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A006936() {
    super(new A000670(), 0);
  }
}

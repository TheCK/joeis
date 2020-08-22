package irvine.oeis.a002;

import irvine.oeis.InverseEulerTransformSequence;

/**
 * A002877 Number of connected weighted linear spaces of total weight n.
 * @author Sean A. Irvine
 */
public class A002877 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A002877() {
    super(new A002876(), 0);
    next();
  }
}

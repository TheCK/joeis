package irvine.oeis.a003;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a001.A001190;

/**
 * A003214 Number of binary forests with n nodes.
 * @author Sean A. Irvine
 */
public class A003214 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A003214() {
    super(new A001190(), 1);
  }
}

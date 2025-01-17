package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A001384 Number of n-node trees of height at most 4.
 * @author Sean A. Irvine
 */
public class A001384 extends PrependSequence {

  /** Construct the sequence. */
  public A001384() {
    super(new EulerTransformSequence(new A001383(), 1), Z.ONE);
  }
}

package irvine.oeis.a300;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a000.A000041;


/**
 * A300508 Expansion of Product_{k&gt;=1} (1 - x^k)^p(k), where p(k) = number of partitions of k (A000041).
 * G.f.: <code>Product_{k&gt;=1} ((1-x^k)^A000041(k))</code>
 * @author Georg Fischer
 */
public class A300508 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A300508() {
    super(0, 1);
    mSeqF = new A000041();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().negate()};
  }

}

package irvine.oeis.a182;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a038.A038548;


/**
 * A182270 Number of representations of n as a sum of products of pairs of integers larger than 1, considered to be equivalent when terms or factors are reordered.
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^(A038548(k)-1))</code>
 * @author Georg Fischer
 */
public class A182270 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A182270() {
    super(0, 1);
    mSeqF = new A038548();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().subtract(1)};
  }
  
}

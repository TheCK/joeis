package irvine.oeis.a307;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a008.A008683;


/**
 * A307656 G.f. A(x) satisfies: (1 - x) = A(x)*A(x^2)^2*A(x^3)^3*A(x^4)^4* ... *A(x^k)^k* ...
 * G.f.: <code>Product_{k&gt;=1} ((1-x^k)^(A008683(k)*k))</code>
 * @author Georg Fischer
 */
public class A307656 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A307656() {
    super(0, 1);
    mSeqF = new A008683();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().multiply(k).negate()};
  }
  
}

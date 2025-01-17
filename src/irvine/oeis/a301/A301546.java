package irvine.oeis.a301;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a013.A013956;


/**
 * A301546 Expansion of Product_{k&gt;=1} 1/(1 - x^k)^(sigma_8(k)).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^A013956(k))</code>
 * @author Georg Fischer
 */
public class A301546 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A301546() {
    super(0, 1);
    mSeqF = new A013956();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next()};
  }
  
}

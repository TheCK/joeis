package irvine.oeis.a293;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a001.A001221;


/**
 * A293548 Expansion of Product_{k&gt;=2} 1/(1 - x^k)^omega(k), where omega(k) is the number of distinct primes dividing k (A001221).
 * G.f.: <code>Product_{k&gt;=2} (1/(1-x^k)^A001221(k))</code>
 * @author Georg Fischer
 */
public class A293548 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A293548() {
    super(0, 2);
    mSeqF = new A001221();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next()};
  }

  @Override
  protected Z advanceG(final long k) {
    return (mKfg < 2) ? Z.ZERO : Z.ONE;
  }

}

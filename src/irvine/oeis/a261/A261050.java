package irvine.oeis.a261;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a000.A000045;


/**
 * A261050 Expansion of Product_{k&gt;=1} (1+x^k)^(Fibonacci(k)).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A000045(k))</code>
 * @author Georg Fischer
 */
public class A261050 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A261050() {
    super(0, 1);
    mSeqF = new A000045();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}

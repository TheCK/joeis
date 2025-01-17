package irvine.oeis.a294;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;
import irvine.oeis.a085.A085787;


/**
 * A294840 Expansion of Product_{k&gt;=1} (1 + x^(2*k-1))^(k*(5*k-3)/2)*(1 + x^(2*k))^(k*(5*k+3)/2).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A085787(k))</code>
 * @author Georg Fischer
 */
public class A294840 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A294840() {
    super(0, 1);
    mSeqF = new A085787();
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

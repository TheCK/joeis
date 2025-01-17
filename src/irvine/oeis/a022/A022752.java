package irvine.oeis.a022;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A022752 Expansion of Product (1-m*q^m)^-28; m=1..inf.
 * G.f.: <code>Product_{k&gt;=1} ((1-k*x^k)^(-28))</code>
 * @author Georg Fischer
 */
public class A022752 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A022752() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(28)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(k);
  }

}

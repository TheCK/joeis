package irvine.oeis.a162;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007304;

/**
 * A162143 a(n) = A007304(n)^2.
 * @author Georg Fischer
 */
public class A162143 implements Sequence {

  final Sequence mA007304 = new A007304();
  /** Construct the sequence. */
  public A162143() {
  }
  
  @Override
  public Z next() {
    return mA007304.next().pow(Z.TWO);
  }

}

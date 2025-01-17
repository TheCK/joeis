package irvine.oeis.a262;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;
import irvine.oeis.a010.A010693;

/**
 * A262392 a(n) = A007504(n) + A010693(n).
 * @author Georg Fischer
 */
public class A262392 implements Sequence {

  final Sequence mA007504 = new A007504();
  final Sequence mA010693 = new A010693();
  @Override
  public Z next() {
    return mA007504.next().add(mA010693.next());
  }

}

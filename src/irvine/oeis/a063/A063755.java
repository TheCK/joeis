package irvine.oeis.a063;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007694;

/**
 * A063755 Squares k which are divisible by phi(k).
 * @author Georg Fischer
 */
public class A063755 implements Sequence {

  final Sequence mA007694 = new A007694();
  @Override
  public Z next() {
    return mA007694.next().pow(Z.TWO);
  }

}

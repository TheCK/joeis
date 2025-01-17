package irvine.oeis.a069;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001248;

/**
 * A069262 a(n) = 4*prime(n)^2.
 * @author Georg Fischer
 */
public class A069262 implements Sequence {

  final Sequence mA001248 = new A001248();
  @Override
  public Z next() {
    return Z.FOUR.multiply(mA001248.next());
  }

}

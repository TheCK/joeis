package irvine.oeis.a061;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006093;

/**
 * A061286 Smallest integer for which the number of divisors is the n-th prime.
 * @author Georg Fischer
 */
public class A061286 implements Sequence {

  final Sequence mA006093 = new A006093();
  @Override
  public Z next() {
    return Z.TWO.pow(mA006093.next());
  }

}

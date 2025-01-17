package irvine.oeis.a125;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007530;

/**
 * A125855 Numbers k such that k+1, k+3, k+7 and k+9 are all primes.
 * @author Georg Fischer
 */
public class A125855 implements Sequence {

  final Sequence mA007530 = new A007530();
  @Override
  public Z next() {
    return mA007530.next().subtract(Z.ONE);
  }

}

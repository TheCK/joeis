package irvine.oeis.a074;
// Generated by gen_seq4.pl sigma0 at 2021-07-01 22:13

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a036.A036035;

/**
 * A074139 Number of divisors of A036035(n,k).
 * @author Georg Fischer
 */
public class A074139 extends A036035 {

  
  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0();
  }
}

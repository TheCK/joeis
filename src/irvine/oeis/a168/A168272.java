package irvine.oeis.a168;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006450;
import irvine.oeis.a007.A007821;

/**
 * A168272 Abs(prime(prime(n))-prime(nonprime(n))).
 * @author Georg Fischer
 */
public class A168272 implements Sequence {

  final Sequence mA006450 = new A006450();
  final Sequence mA007821 = new A007821();
  @Override
  public Z next() {
    return mA006450.next().subtract(mA007821.next()).abs();
  }

}

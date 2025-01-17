package irvine.oeis.a065;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a059.A059376;
import irvine.oeis.a069.A069091;

/**
 * A065959 a(n) = n^3*Product_{distinct primes p dividing n} (1+1/p^3).
 * @author Georg Fischer
 */
public class A065959 implements Sequence {

  final Sequence mA059376 = new A059376();
  final Sequence mA069091 = new A069091();
  @Override
  public Z next() {
    return mA069091.next().divide(mA059376.next());
  }

}

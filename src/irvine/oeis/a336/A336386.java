package irvine.oeis.a336;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001222;
import irvine.oeis.a058.A058063;

/**
 * A336386 a(n) = bigomega(sigma(n)) - bigomega(n), where bigomega (A001222) gives the number of prime factors with multiplicity, and sigma (A000203) gives the sum of divisors.
 * @author Georg Fischer
 */
public class A336386 implements Sequence {

  final Sequence mA001222 = new A001222();
  final Sequence mA058063 = new A058063();
  @Override
  public Z next() {
    return mA058063.next().subtract(mA001222.next());
  }

}

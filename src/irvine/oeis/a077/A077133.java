package irvine.oeis.a077;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A077133 Difference between the sum of odd-indexed primes and even-indexed primes.
 * @author Georg Fischer
 */
public class A077133 implements Sequence {

  final Sequence mA077126 = new A077126();
  final Sequence mA077131 = new A077131();
  @Override
  public Z next() {
    return mA077126.next().subtract(mA077131.next());
  }

}

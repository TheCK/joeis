package irvine.oeis.a089;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a086.A086303;

/**
 * A089559 Nonnegative numbers n such that 2*n + 15 is prime.
 * @author Georg Fischer
 */
public class A089559 implements Sequence {

  final Sequence mA086303 = new A086303();
  @Override
  public Z next() {
    return mA086303.next().divide(Z.TWO);
  }

}

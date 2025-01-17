package irvine.oeis.a077;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a069.A069532;

/**
 * A077491 a(n) = smallest k such that 2k has digit sum = n.
 * @author Georg Fischer
 */
public class A077491 implements Sequence {

  final Sequence mA069532 = new A069532();
  @Override
  public Z next() {
    return mA069532.next().divide(Z.TWO);
  }

}

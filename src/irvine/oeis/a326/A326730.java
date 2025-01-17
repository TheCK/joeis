package irvine.oeis.a326;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000120;
import irvine.oeis.a029.A029931;

/**
 * A326730 Number of iterations of A326729(x) starting at x = n to reach 0.
 * @author Georg Fischer
 */
public class A326730 implements Sequence {

  final Sequence mA000120 = new A000120();
  final Sequence mA029931 = new A029931();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA029931.next()).subtract(mA000120.next().pow(Z.TWO));
  }

}

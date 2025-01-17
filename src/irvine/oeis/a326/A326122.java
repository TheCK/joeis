package irvine.oeis.a326;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;

/**
 * A326122 a(n) = 10 * sigma(n).
 * @author Georg Fischer
 */
public class A326122 implements Sequence {

  final Sequence mA000203 = new A000203();
  @Override
  public Z next() {
    return Z.TEN.multiply(mA000203.next());
  }

}

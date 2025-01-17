package irvine.oeis.a062;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000312;

/**
 * A062206 a(n) = n^(2n).
 * @author Georg Fischer
 */
public class A062206 implements Sequence {

  final Sequence mA000312 = new A000312();
  @Override
  public Z next() {
    return mA000312.next().pow(Z.TWO);
  }

}

package irvine.oeis.a139;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000043;

/**
 * A139306 Ultraperfect numbers: 2^(2p - 1), where p is A000043(n).
 * @author Georg Fischer
 */
public class A139306 implements Sequence {

  final Sequence mA000043 = new A000043();
  @Override
  public Z next() {
    return Z.TWO.pow(Z.TWO.multiply(mA000043.next()).subtract(Z.ONE));
  }

}

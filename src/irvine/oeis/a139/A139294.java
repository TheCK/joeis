package irvine.oeis.a139;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000668;

/**
 * A139294 2^(2p - 1), where p is a Mersenne prime A000668(n).
 * @author Georg Fischer
 */
public class A139294 implements Sequence {

  final Sequence mA000668 = new A000668();
  @Override
  public Z next() {
    return Z.TWO.pow(Z.TWO.multiply(mA000668.next()).subtract(Z.ONE));
  }

}

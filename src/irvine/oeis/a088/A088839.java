package irvine.oeis.a088;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006519;
import irvine.oeis.a096.A096268;

/**
 * A088839 Numerator of sigma(4n)/sigma(n).
 * @author Georg Fischer
 */
public class A088839 implements Sequence {

  final Sequence mA006519 = new A006519();
  final Sequence mA096268 = new A096268();
  @Override
  public Z next() {
    return Z.EIGHT.multiply(mA006519.next()).subtract(Z.ONE).divide(Z.ONE.add(Z.TWO.multiply(mA096268.next())));
  }

}

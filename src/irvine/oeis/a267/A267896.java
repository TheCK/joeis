package irvine.oeis.a267;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a024.A024675;
import irvine.oeis.a028.A028334;

/**
 * A267896 a(n) = (Prime(n+1)^2 - Prime(n)^2) / 8.
 * @author Georg Fischer
 */
public class A267896 implements Sequence {

  final Sequence mA024675 = new A024675();
  final Sequence mA028334 = new A028334();
  @Override
  public Z next() {
    return mA024675.next().multiply(mA028334.next()).divide(Z.TWO);
  }

}

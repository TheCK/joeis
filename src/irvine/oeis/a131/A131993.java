package irvine.oeis.a131;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006093;
import irvine.oeis.a030.A030516;

/**
 * A131993 1 + prime(n) + prime(n)^2 + prime(n)^3 + prime(n)^4 + prime(n)^5.
 * @author Georg Fischer
 */
public class A131993 implements Sequence {

  final Sequence mA006093 = new A006093();
  final Sequence mA030516 = new A030516();
  @Override
  public Z next() {
    return mA030516.next().subtract(Z.ONE).divide(mA006093.next());
  }

}

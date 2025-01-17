package irvine.oeis.a087;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034602;

/**
 * A087754 a(n) = (C(2p,p)-2) / p^3, where p = prime(n).
 * @author Georg Fischer
 */
public class A087754 implements Sequence {

  final Sequence mA034602 = new A034602();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA034602.next());
  }

}

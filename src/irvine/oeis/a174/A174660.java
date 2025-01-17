package irvine.oeis.a174;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a158.A158611;

/**
 * A174660 2^A158611(n) mod A002808(n).
 * @author Georg Fischer
 */
public class A174660 implements Sequence {

  final Sequence mA002808 = new A002808();
  final Sequence mA158611 = new A158611();
  @Override
  public Z next() {
    return Z.TWO.pow(mA158611.next()).mod(mA002808.next());
  }

}

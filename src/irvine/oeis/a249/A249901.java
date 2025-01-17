package irvine.oeis.a249;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001222;
import irvine.oeis.a008.A008683;

/**
 * A249901 a(n) = mu(n) + bigomega(n).
 * @author Georg Fischer
 */
public class A249901 implements Sequence {

  final Sequence mA001222 = new A001222();
  final Sequence mA008683 = new A008683();
  @Override
  public Z next() {
    return mA008683.next().add(mA001222.next());
  }

}

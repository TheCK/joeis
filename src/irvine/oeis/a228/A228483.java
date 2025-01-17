package irvine.oeis.a228;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008683;

/**
 * A228483 a(n) = 2 - mu(n), where mu(n) is the Moebius function (A008683).
 * @author Georg Fischer
 */
public class A228483 implements Sequence {

  final Sequence mA008683 = new A008683();
  @Override
  public Z next() {
    return Z.TWO.subtract(mA008683.next());
  }

}

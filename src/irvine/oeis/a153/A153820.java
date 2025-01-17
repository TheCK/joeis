package irvine.oeis.a153;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a006.A006789;

/**
 * A153820 Bell number A000110(n) minus Bessel number A006789(n).
 * @author Georg Fischer
 */
public class A153820 implements Sequence {

  final Sequence mA000110 = new A000110();
  final Sequence mA006789 = new A006789();
  @Override
  public Z next() {
    return mA000110.next().subtract(mA006789.next());
  }

}

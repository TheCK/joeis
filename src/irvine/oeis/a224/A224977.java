package irvine.oeis.a224;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a004.A004159;

/**
 * A224977 n^2 minus sum of digits of n^2.
 * @author Georg Fischer
 */
public class A224977 implements Sequence {

  final Sequence mA000290 = new A000290();
  final Sequence mA004159 = new A004159();
  @Override
  public Z next() {
    return mA000290.next().subtract(mA004159.next());
  }

}

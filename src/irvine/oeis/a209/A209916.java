package irvine.oeis.a209;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000332;
import irvine.oeis.a047.A047656;

/**
 * A209916 Kolmogorov's button, 2-color generic convex polygon version.
 * @author Georg Fischer
 */
public class A209916 implements Sequence {

  final Sequence mA000332 = new A000332();
  final Sequence mA047656 = new A047656();
  @Override
  public Z next() {
    return mA047656.next().multiply(Z.TWO.pow(mA000332.next())).subtract(Z.ONE);
  }

}

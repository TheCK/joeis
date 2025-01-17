package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056624 Number of unitary square divisors of n.
 * @author Sean A. Irvine
 */
public class A056624 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 0) {
        ++cnt;
      }
    }
    return Z.ONE.shiftLeft(cnt);
  }
}

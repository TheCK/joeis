package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050695 Composite numbers k such that none of the prime factors of k is a substring of k.
 * @author Sean A. Irvine
 */
public class A050695 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    outer:
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
        final String s = String.valueOf(mN);
        for (final Z d : fs.toZArray()) {
          if (s.contains(d.toString())) {
            continue outer;
          }
        }
        return Z.valueOf(mN);
      }
    }
  }
}

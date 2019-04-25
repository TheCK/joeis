package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015870 Numbers n such that phi(n <code>+ 4)</code> | <code>sigma(n) + 4</code>.
 * @author Sean A. Irvine
 */
public class A015870 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = Cheetah.factor(++mN);
      if (sigma.add(4).mod(mFactorSequenceD.phi()).equals(Z.ZERO)) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}

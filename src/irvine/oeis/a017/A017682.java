package irvine.oeis.a017;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017682 Denominator of sum of -9th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A017682 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Q(Cheetah.factor(mN).sigma(9), mN.pow(9)).den();
  }
}


package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045984 a(n) = smallest number m such that factorizations of n consecutive integers starting at m have same number of primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A045984 implements Sequence {

  private long mN = 0;
  private long mK = 1;

  private boolean isOk(final long k) {
    final long omega = Cheetah.factor(k).bigOmega();
    for (int j = 1; j < mN; ++j) {
      if (Cheetah.factor(k + j).bigOmega() != omega) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isOk(mK)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}

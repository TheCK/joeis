package irvine.oeis.a052;

import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052215 a(n) = smallest number m such that m and m+1 are the product of exactly n distinct primes.
 * @author Sean A. Irvine
 */
public class A052215 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      final FactorSequence fs0 = Cheetah.factor(++m);
      final FactorSequence fs1 = Cheetah.factor(m + 1);
      if (fs0.omega() == fs1.omega()) {
        final TreeSet<Z> set = new TreeSet<>();
        Collections.addAll(set, fs0.toZArray());
        Collections.addAll(set, fs1.toZArray());
        if (set.size() == 2 * mN) {
          return Z.valueOf(m);
        }
      }
    }
  }
}

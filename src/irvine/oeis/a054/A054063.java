package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054063 Least k for which the integers Floor(k/(log(m+1))) for m=1,2,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A054063 implements Sequence {

  private long mN = 0;
  private long mK = 1;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Z> seen = new TreeSet<>();
    while (true) {
      seen.clear();
      for (long m = 1; m <= mN; ++m) {
        if (!seen.add(CR.valueOf(m + 1).log().inverse().multiply(mK).floor())) {
          break;
        }
      }
      if (seen.size() == mN) {
        return Z.valueOf(mK);
      }
      ++mK;
    }
  }
}

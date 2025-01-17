package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052491 Smallest "inconsummate number" in base n: smallest number such that in base n, no number is this multiple of the sum of its digits.
 * @author Sean A. Irvine
 */
public class A052491 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      long k = m;
      final long limit = 10 * mN * m; // heuristic?
      while (ZUtils.digitSum(k, mN) * m != k && k < limit) {
        k += m;
      }
      if (k != limit) {
        ++m;
      } else {
        return Z.valueOf(m);
      }
    }
  }
}


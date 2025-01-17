package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023093 Numbers k such that k and 9*k are anagrams.
 * @author Sean A. Irvine
 */
public class A023093 implements Sequence {

  private long mN = -9;

  @Override
  public Z next() {
    while (true) {
      mN += 9;
      final String s = Long.toString(mN);
      final String t = Long.toString(9 * mN);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}

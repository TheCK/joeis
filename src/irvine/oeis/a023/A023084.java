package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023084 Numbers n such that n and 7*n are anagrams in base 9 (written in base 9).
 * @author Sean A. Irvine
 */
public class A023084 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 9);
      final String t = Long.toString(7 * mN, 9);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}

package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029736 Palindromic cubes in base 16.
 * @author Sean A. Irvine
 */
public class A029736 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.pow(3);
      if (StringUtils.isPalindrome(t.toString(16))) {
        return t;
      }
    }
  }
}

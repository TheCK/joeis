package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029737 Numbers whose square is palindromic in base 12.
 * @author Sean A. Irvine
 */
public class A029737 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(12))) {
        return mN;
      }
    }
  }
}

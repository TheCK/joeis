package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046262 Largest palindromic substring in 4^n.
 * @author Sean A. Irvine
 */
public class A046262 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(4);
    return new Z(A046260.largestPalindromicSubstring(mA.toString()));
  }
}

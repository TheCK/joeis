package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046267 Largest palindromic substring in 9^n.
 * @author Sean A. Irvine
 */
public class A046267 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(9);
    return new Z(A046260.largestPalindromicSubstring(mA.toString()));
  }
}

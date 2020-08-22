package irvine.oeis.a031;
// Generated by gen_seq4.pl juxnrev 5 at 2019-07-04 11:13
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031235 Triangle T(n,k): write n in base 5, reverse order of digits.
 * @author Georg Fischer
 */
public class A031235 implements Sequence {
 
  private StringBuilder mS = new StringBuilder();
  private int mPos = 0;
  private Z mN = Z.valueOf(0 - 1);

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = new StringBuilder(mN.toString(5)).reverse();
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos) - '0');
  }
}

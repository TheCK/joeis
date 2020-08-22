package irvine.oeis.a030;
// Generated by gen_seq4.pl juxnrev 2 at 2019-07-04 11:13
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030308 Triangle T(n, k): Write n in base 2, reverse order of digits, to get the n-th row.
 * @author Georg Fischer
 */
public class A030308 implements Sequence {
 
  private StringBuilder mS = new StringBuilder();
  private int mPos = 0;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = new StringBuilder(mN.toString(2)).reverse();
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos) - '0');
  }
}

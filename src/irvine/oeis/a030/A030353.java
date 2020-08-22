package irvine.oeis.a030;
// Generated by gen_seq4.pl jux2n_1 3 at 2019-07-04 11:14
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030353 Write 2n-1 in base 3 and juxtapose.
 * @author Georg Fischer
 */
public class A030353 implements Sequence {
 
  private String mS = "";
  private int mPos = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.multiply(2).subtract(1).toString(3);
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos) - '0');
  }
}

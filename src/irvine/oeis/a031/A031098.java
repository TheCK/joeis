package irvine.oeis.a031;
// Generated by gen_seq4.pl juxncomp 9 at 2019-06-29 14:09
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031098 Write n in base 9, then complement each digit (d -&gt; 8-d) and juxtapose.
 * @author Georg Fischer
 */
public class A031098 implements Sequence {
 
  private String mS = "";
  private int mPos = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.toString(9);
      mPos = 0;
    }
    return Z.valueOf(9 - 1 - (mS.charAt(mPos) - '0'));
  }
}

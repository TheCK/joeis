package irvine.oeis.a030;
// Generated by gen_seq4.pl juxncomp 4 at 2019-06-29 14:09
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030399 Write n in base 4, then complement each digit (d -&gt; 3-d) and juxtapose.
 * @author Georg Fischer
 */
public class A030399 implements Sequence {
 
  private String mS = "";
  private int mPos = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    ++mPos;
    if (mPos >= mS.length()) {
      mN = mN.add(1);
      mS = mN.toString(4);
      mPos = 0;
    }
    return Z.valueOf(4 - 1 - (mS.charAt(mPos) - '0'));
  }
}

package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdig12b 1 4 10 add at 2019-07-04 11:15
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A044007 Numbers n such that 1 and 4 occur juxtaposed in the base 10 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044007 implements Sequence {

  private static final String P12 = String.valueOf(1) + String.valueOf(4);
  private static final String P21 = String.valueOf(4) + String.valueOf(1);
  private int mN = 1;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      final String sta = mK.toString(10);
      final String stb = mK.add(Z.ONE).toString(10);
      if ((sta.contains(P12) || sta.contains(P21))
        && (!stb.contains(P12) && !stb.contains(P21))) { // isOk
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    ++mN;
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in A044007");
    }
    return mK;
  }
}

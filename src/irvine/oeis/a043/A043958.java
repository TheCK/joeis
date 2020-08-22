package irvine.oeis.a043;
// Generated by gen_seq4.pl juxdig12b 5 7 8 add at 2019-07-04 11:15
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043958 Numbers n such that 5 and 7 occur juxtaposed in the base 8 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A043958 implements Sequence {

  private static final String P12 = String.valueOf(5) + String.valueOf(7);
  private static final String P21 = String.valueOf(7) + String.valueOf(5);
  private int mN = 1;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      final String sta = mK.toString(8);
      final String stb = mK.add(Z.ONE).toString(8);
      if ((sta.contains(P12) || sta.contains(P21))
        && (!stb.contains(P12) && !stb.contains(P21))) { // isOk
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    ++mN;
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in A043958");
    }
    return mK;
  }
}

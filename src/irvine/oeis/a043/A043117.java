package irvine.oeis.a043;
// Generated by gen_seq4.pl juxdig12b 0 2 6 subtract at 2019-07-04 11:15
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043117 Numbers n such that 0 and 2 occur juxtaposed in the base 6 representation of n but not of n-1.
 * @author Georg Fischer
 */
public class A043117 implements Sequence {

  private static final String P12 = String.valueOf(0) + String.valueOf(2);
  private static final String P21 = String.valueOf(2) + String.valueOf(0);
  private int mN = 1;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      final String sta = mK.toString(6);
      final String stb = mK.subtract(Z.ONE).toString(6);
      if ((sta.contains(P12) || sta.contains(P21))
        && (!stb.contains(P12) && !stb.contains(P21))) { // isOk
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    ++mN;
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in A043117");
    }
    return mK;
  }
}

package irvine.oeis.a043;
// Generated by gen_seq4.pl juxdig12b 4 5 7 add at 2019-07-04 11:15
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043929 Numbers n such that 4 and 5 occur juxtaposed in the base 7 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A043929 implements Sequence {

  private static final String P12 = String.valueOf(4) + String.valueOf(5);
  private static final String P21 = String.valueOf(5) + String.valueOf(4);
  private int mN = 1;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      final String sta = mK.toString(7);
      final String stb = mK.add(Z.ONE).toString(7);
      if ((sta.contains(P12) || sta.contains(P21))
        && (!stb.contains(P12) && !stb.contains(P21))) { // isOk
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    ++mN;
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in A043929");
    }
    return mK;
  }
}

package irvine.oeis.a043;
// Generated by gen_seq4.pl juxdig12b 2 3 4 add at 2019-07-04 11:15
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043885 Numbers k such that 2 and 3 occur juxtaposed in the base-4 representation of k but not of k+1.
 * @author Georg Fischer
 */
public class A043885 implements Sequence {

  private static final String P12 = String.valueOf(2) + String.valueOf(3);
  private static final String P21 = String.valueOf(3) + String.valueOf(2);
  private int mN = 1;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      final String sta = mK.toString(4);
      final String stb = mK.add(Z.ONE).toString(4);
      if ((sta.contains(P12) || sta.contains(P21))
        && (!stb.contains(P12) && !stb.contains(P21))) { // isOk
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    ++mN;
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in A043885");
    }
    return mK;
  }
}

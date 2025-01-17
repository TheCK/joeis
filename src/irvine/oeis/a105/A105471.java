package irvine.oeis.a105;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A105471 a(n) = Fibonacci(n) mod 100.
 * @author Georg Fischer
 */
public class A105471 implements Sequence {

  protected Z mA_1;
  protected Z mA_2;
  protected int mN;
  protected Z mParm;

  /** Construct the sequence. */
  public A105471() {
    this(100);
  }

  /**
   * Generic constructor with parameter
   * @param parm parameter
   */
  public A105471(final int parm) {
    mParm = Z.valueOf(parm);
    mA_1 = Z.ONE;
    mA_2 = Z.ZERO;
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA_2;
    } else if (mN == 1) {
      return mA_1;
    } else {
      final Z result = mA_2.add(mA_1).mod(mParm);
      mA_2 = mA_1;
      mA_1 = result;
      return result;
    }
  }
}

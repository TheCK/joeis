package irvine.oeis.a182;
// Generated by gen_seq4.pl arsimple/prev1 at 2021-11-18 23:20

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A182250 a(0)=2, a(n) = (a(n-1) * n) OR n.
 * @author Georg Fischer
 */
public class A182250 implements Sequence {

  private int mN = -1;
  private Z mAn1 = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    if (mN > 0) {
      mAn1 = mAn1.multiply(n).or(n);
    }
    return mAn1;
  }
}

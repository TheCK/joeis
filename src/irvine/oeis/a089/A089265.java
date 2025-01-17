package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A089265 a(1) = 0; thereafter a(2*n) = a(n) + 1, a(2*n+1) = 2*n.
 * a(n) = valuation(n, 2) + n/2^valuation(n, 2) - 1.
 * @author Georg Fischer
 */
public class A089265 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A089265() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final long v2 = ZUtils.valuation(Z.valueOf(mN), Z.TWO);
    return Z.valueOf(v2 + mN / (1 << v2) - 1);
  }
}

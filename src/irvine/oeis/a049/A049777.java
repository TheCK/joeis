package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A049777 Triangular array read by rows: T(m,n) = n + n+1 + ... + m = (m+n)(m-n+1)/2.
 * @author Sean A. Irvine
 */
public class A049777 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return A000217.triangular(mN).subtract(A000217.triangular(mM));
  }
}

package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024424 <code>a(n) =</code> greatest residue of <code>S(n,m) mod C(n-1,m-1)</code>, for m <code>= 1,2,...,n; S(n,m)</code> are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024424 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      max = max.max(Stirling.secondKind(mN, k).mod(Binomial.binomial(mN - 1, k - 1)));
    }
    return max;
  }
}
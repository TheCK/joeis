package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a053.A053871;
import irvine.oeis.triangle.Triangle;

/**
 * A055140 Triangle: matchings of 2n people with partners (of either sex) such that exactly k couples are left together.
 * a(n, k) = A053871(n-k)*binomial(n, k).
 * @author Georg Fischer
 */
public class A055140 extends Triangle {

  private MemorySequence mSeq;

  /** Construct the sequence. */
  public A055140() {
    mSeq = MemorySequence.cachedSequence(new A053871());
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(mSeq.a(n - k));
  }
}

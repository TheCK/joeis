package irvine.oeis.a055;
// manually deris2/primeval at 2021-11-04 22:44

import irvine.math.z.Z;
import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.a054.A054637;
/**
 * A055072 Primes in A054637.
 * @author Georg Fischer
 */
public class A055072 extends PrimeSubsequence {

  private Z mPrev = Z.ZERO;

  /** Construct the sequence. */
  public A055072() {
    super(new A054637());
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (result.equals(mPrev)) {
      result = super.next();
    }
    mPrev = result;
    return result;
  }
}

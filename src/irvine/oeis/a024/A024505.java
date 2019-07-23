package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024505 <code>a(n) = [ C(2n,n)/2^(n+2) ]</code>.
 * @author Sean A. Irvine
 */
public class A024505 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).shiftRight(mN + 2);
  }
}
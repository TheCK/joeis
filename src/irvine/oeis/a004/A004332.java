package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004332 a(n) =  C(4n,n-2).
 * @author Sean A. Irvine
 */
public class A004332 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 2);
  }
}


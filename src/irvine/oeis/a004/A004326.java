package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004326 Binomial coefficient C(3n,n-8).
 * @author Sean A. Irvine
 */
public class A004326 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 8);
  }
}


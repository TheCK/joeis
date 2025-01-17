package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004388 Binomial coefficient C(8n,n-7).
 * @author Sean A. Irvine
 */
public class A004388 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 7);
  }
}


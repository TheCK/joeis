package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004383 Binomial coefficient <code>C(8n,n-2)</code>.
 * @author Sean A. Irvine
 */
public class A004383 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 2);
  }
}


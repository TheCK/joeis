package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017718 Binomial coefficients <code>C(n,54)</code>.
 * @author Sean A. Irvine
 */
public class A017718 implements Sequence {

  private long mN = 53;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 54);
  }
}


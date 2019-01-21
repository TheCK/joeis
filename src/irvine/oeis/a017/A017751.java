package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017751.
 * @author Sean A. Irvine
 */
public class A017751 implements Sequence {

  private long mN = 86;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 87);
  }
}


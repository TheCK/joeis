package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017763 <code>a(n) =</code> binomial coefficient <code>C(n,99)</code>.
 * @author Sean A. Irvine
 */
public class A017763 implements Sequence {

  private long mN = 98;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 99);
  }
}


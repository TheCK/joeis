package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050921 Smallest prime of form n*2^m+1, m &gt;= 0, or 0 if no prime exists.
 * @author Sean A. Irvine
 */
public class A050921 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    while (!n.add(1).isProbablePrime()) {
      n = n.multiply2();
    }
    return n.add(1);
  }
}

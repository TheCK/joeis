package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028899 Map n = Sum c_i 10^i to a(n) = Sum c_i 4^i.
 * @author Sean A. Irvine
 */
public class A028899 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    Z sum = Z.ZERO;
    int m = -2;
    while (t != 0) {
      m += 2;
      sum = sum.add((t % 10) << m);
      t /= 10;
    }
    return sum;
  }
}

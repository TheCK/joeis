package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053392 a(n) is the concatenation of the sums of every pair of consecutive digits of n (with a(n) = 0 for 0 &lt;= n &lt;= 9).
 * @author Sean A. Irvine
 */
public class A053392 implements Sequence {

  private long mN = -1;

  protected Z step(final Z n) {
    if (n.compareTo(Z.TEN) < 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    final String s = n.toString();
    for (int k = 1; k < s.length(); ++k) {
      sb.append(s.charAt(k - 1) + s.charAt(k) - 2 * '0');
    }
    return new Z(sb);
  }

  @Override
  public Z next() {
    return step(Z.valueOf(++mN));
  }
}


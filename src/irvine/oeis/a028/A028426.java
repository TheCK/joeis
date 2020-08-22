package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028426 Clog sequence in base 5. Right to left concatenation of n,int(log_5(n)),int(log_5(int(log_5(n)))),... in base5.
 * @author Sean A. Irvine
 */
public class A028426 implements Sequence {

  private static final CR BASE_LOG = CR.FIVE.log();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toString(m, 5));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    return new Z(sb, 5);
  }
}

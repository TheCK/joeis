package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051889 a(n) = min{m: sum(binomial(n,i)*(1/6)^i*(1-1/6)^(n-i),i=0..m)&gt;=.95}.
 * @author Sean A. Irvine
 */
public class A051889 implements Sequence {

  private static final Q LIMIT = new Q(95, 100);
  private static final Q OS = new Q(1, 6);
  private static final Q FS = new Q(5, 6);
  private int mN = -1;

  @Override
  public Z next() {
    long m = -1;
    Q t = FS.pow(++mN);
    Q sum = Q.ZERO;
    while (sum.compareTo(LIMIT) < 0) {
      sum = sum.add(t.multiply(Binomial.binomial(mN, ++m)));
      t = t.multiply(OS).divide(FS);
    }
    return Z.valueOf(m);
  }
}

package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a031.A031924;

/**
 * A052352 First primes of A031924 (lesser of 6-twins) with increasing distance to the next 6-twin.
 * @author Sean A. Irvine
 */
public class A052352 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    mN += 2;
    final Sequence seq = new A031924();
    Z p = seq.next();
    while (true) {
      final Z q = p;
      p = seq.next();
      if (p.subtract(q).longValueExact() == mN) {
        return q;
      }
    }
  }
}

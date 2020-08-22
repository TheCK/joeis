package irvine.oeis.a215;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A215381 Primes congruent to {0, 1, 2, 3} mod 19.
 * @author Sean Irvine
 */
public class A215381 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(19);
      if (r == 0 || r == 1 || r == 2 || r == 3) {
        return p;
      }
    }
  }
}

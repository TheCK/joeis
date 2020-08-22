package irvine.oeis.a215;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A215275 Primes congruent to {2, 4, 5, 6} mod 11.
 * @author Sean Irvine
 */
public class A215275 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(11);
      if (r == 2 || r == 4 || r == 5 || r == 6) {
        return p;
      }
    }
  }
}

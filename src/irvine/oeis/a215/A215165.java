package irvine.oeis.a215;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A215165 Primes congruent to {1, 4} mod 17.
 * @author Sean Irvine
 */
public class A215165 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(17);
      if (r == 1 || r == 4) {
        return p;
      }
    }
  }
}

package irvine.oeis.a042;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A042994 Primes congruent to {0, 1, 2, 3, 5} mod 7.
 * @author Sean Irvine
 */
public class A042994 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(7);
      if (r == 0 || r == 1 || r == 2 || r == 3 || r == 5) {
        return p;
      }
    }
  }
}

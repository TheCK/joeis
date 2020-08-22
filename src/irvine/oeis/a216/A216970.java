package irvine.oeis.a216;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A216970 Primes congruent to 1 mod 37.
 * @author Sean Irvine
 */
public class A216970 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(37);
      if (r == 1) {
        return p;
      }
    }
  }
}

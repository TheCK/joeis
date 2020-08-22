package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142121 Primes congruent to 12 mod 37.
 * @author Sean Irvine
 */
public class A142121 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(37);
      if (r == 12) {
        return p;
      }
    }
  }
}

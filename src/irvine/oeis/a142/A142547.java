package irvine.oeis.a142;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A142547 Primes congruent to 17 mod 53.
 * @author Sean Irvine
 */
public class A142547 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(53);
      if (r == 17) {
        return p;
      }
    }
  }
}

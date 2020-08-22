package irvine.oeis.a214;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A214890 Primes congruent to {2, 3} mod 17.
 * @author Sean Irvine
 */
public class A214890 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(17);
      if (r == 2 || r == 3) {
        return p;
      }
    }
  }
}

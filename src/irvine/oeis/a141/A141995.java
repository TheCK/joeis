package irvine.oeis.a141;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A141995 Primes congruent to 19 mod 29.
 * @author Sean Irvine
 */
public class A141995 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(29);
      if (r == 19) {
        return p;
      }
    }
  }
}

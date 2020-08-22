package irvine.oeis.a141;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A141856 Primes congruent to 9 mod 11.
 * @author Sean Irvine
 */
public class A141856 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(11);
      if (r == 9) {
        return p;
      }
    }
  }
}

package irvine.oeis.a141;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A141873 Primes congruent to 8 mod 19.
 * @author Sean Irvine
 */
public class A141873 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(19);
      if (r == 8) {
        return p;
      }
    }
  }
}

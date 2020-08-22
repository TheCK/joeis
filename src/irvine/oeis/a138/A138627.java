package irvine.oeis.a138;
// Generated by gen_seq4.pl primod at 2020-07-26 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;


/**
 * A138627 Primes congruent to 10 mod 17.
 * @author Sean Irvine
 */
public class A138627 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(17);
      if (r == 10) {
        return p;
      }
    }
  }
}

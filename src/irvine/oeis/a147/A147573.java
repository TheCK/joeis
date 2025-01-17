package irvine.oeis.a147;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a080.A080197;
/**
 * A147573 Numbers with exactly 6 distinct prime divisors {2,3,5,7,11,13}.
 * @author Georg Fischer
 */
public class A147573 implements Sequence {

  private final Sequence mA080197 = new A080197();
  @Override
  public Z next() {
    return Z.valueOf(30030).multiply(mA080197.next());
  }

}

package irvine.oeis.a147;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051038;
/**
 * A147572 Numbers with exactly 5 distinct prime divisors {2,3,5,7,11}.
 * @author Georg Fischer
 */
public class A147572 implements Sequence {

  private final Sequence mA051038 = new A051038();
  @Override
  public Z next() {
    return Z.valueOf(2310).multiply(mA051038.next());
  }

}

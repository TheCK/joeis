package irvine.oeis.a072;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008837;

/**
 * A072205 a(n) = (p^2 - p + 2)/2 for p = prime(n); number of squares modulo p^2.
 * @author Georg Fischer
 */
public class A072205 implements Sequence {

  final Sequence mA008837 = new A008837();
  @Override
  public Z next() {
    return mA008837.next().add(Z.ONE);
  }

}

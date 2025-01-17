package irvine.oeis.a321;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a011.A011772;

/**
 * A321366 a(n) is the least integer k greater than 1 such that n divides binomial(k, 2) = A000217(k-1).
 * @author Georg Fischer
 */
public class A321366 implements Sequence {

  final Sequence mA011772 = new A011772();
  @Override
  public Z next() {
    return mA011772.next().add(Z.ONE);
  }

}

package irvine.oeis.a229;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a020.A020696;

/**
 * A229337 Sum of products of elements of nonempty subsets of divisors of n.
 * @author Georg Fischer
 */
public class A229337 implements Sequence {

  final Sequence mA020696 = new A020696();
  @Override
  public Z next() {
    return mA020696.next().subtract(Z.ONE);
  }

}

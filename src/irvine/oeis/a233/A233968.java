package irvine.oeis.a233;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a138.A138137;

/**
 * A233968 Number of steps between two valleys at height 0 in the infinite Dyck path in which the k-th ascending line segment has A141285(k) steps and the k-th descending line segment has A194446(k) steps, k &gt;= 1.
 * @author Georg Fischer
 */
public class A233968 implements Sequence {

  final Sequence mA138137 = new A138137();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA138137.next());
  }

}

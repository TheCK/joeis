package irvine.oeis.a146;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a144.A144453;

/**
 * A146537 a(n) = A144453(n)/16.
 * @author Georg Fischer
 */
public class A146537 implements Sequence {

  final Sequence mA144453 = new A144453();
  @Override
  public Z next() {
    return mA144453.next().divide(Z.valueOf(16));
  }

}

package irvine.oeis.a241;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a153.A153974;

/**
 * A241808 Numbers k such that (2*k)^3 - 3 is prime.
 * @author Georg Fischer
 */
public class A241808 implements Sequence {

  final Sequence mA153974 = new A153974();
  @Override
  public Z next() {
    return mA153974.next().divide(Z.TWO);
  }

}

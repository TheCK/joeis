package irvine.oeis.a053;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000879;

/**
 * A053683 Number of nonprimes &lt;= prime(n)^2.
 * @author Georg Fischer
 */
public class A053683 implements Sequence {

  final Sequence mA000040 = new A000040();
  final Sequence mA000879 = new A000879();
  @Override
  public Z next() {
    return mA000040.next().pow(Z.TWO).subtract(mA000879.next());
  }

}

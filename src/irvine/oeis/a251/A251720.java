package irvine.oeis.a251;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006094;

/**
 * A251720 a(n) = (p_n)^2 * p_{n+1}, where p_n is the n-th prime, A000040(n).
 * @author Georg Fischer
 */
public class A251720 implements Sequence {

  final Sequence mA000040 = new A000040();
  final Sequence mA006094 = new A006094();
  @Override
  public Z next() {
    return mA000040.next().multiply(mA006094.next());
  }

}

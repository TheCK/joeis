package irvine.oeis.a271;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007814;
import irvine.oeis.a025.A025480;

/**
 * A271519 Let n = (2*i + 1)*2^j; then a(n) = i + j.
 * @author Georg Fischer
 */
public class A271519 implements Sequence {

  final Sequence mA007814 = new A007814();
  final Sequence mA025480 = new A025480();
  @Override
  public Z next() {
    return mA025480.next().add(mA007814.next());
  }

}

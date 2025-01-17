package irvine.oeis.a318;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007814;
import irvine.oeis.a046.A046645;

/**
 * A318440 a(n) = A046645(n) - A007814(n); the 2-adic valuation of A299150.
 * @author Georg Fischer
 */
public class A318440 implements Sequence {

  final Sequence mA007814 = new A007814();
  final Sequence mA046645 = new A046645();
  @Override
  public Z next() {
    return mA046645.next().subtract(mA007814.next());
  }

}

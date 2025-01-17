package irvine.oeis.a318;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007949;

/**
 * A318666 a(n) = 2^{the 3-adic valuation of n}.
 * @author Georg Fischer
 */
public class A318666 implements Sequence {

  final Sequence mA007949 = new A007949();
  @Override
  public Z next() {
    return Z.TWO.pow(mA007949.next());
  }

}

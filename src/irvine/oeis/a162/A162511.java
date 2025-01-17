package irvine.oeis.a162;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008836;
import irvine.oeis.a076.A076479;

/**
 * A162511 Multiplicative function with a(p^e)=(-1)^(e-1).
 * @author Georg Fischer
 */
public class A162511 implements Sequence {

  final Sequence mA008836 = new A008836();
  final Sequence mA076479 = new A076479();
  @Override
  public Z next() {
    return mA076479.next().multiply(mA008836.next());
  }

}

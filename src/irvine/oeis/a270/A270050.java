package irvine.oeis.a270;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003136;

/**
 * A270050 Numbers of the form 2 * (x^2 + xy + y^2).
 * @author Georg Fischer
 */
public class A270050 implements Sequence {

  final Sequence mA003136 = new A003136();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA003136.next());
  }

}

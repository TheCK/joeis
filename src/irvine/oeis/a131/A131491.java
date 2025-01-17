package irvine.oeis.a131;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a039.A039716;

/**
 * A131491 2*prime(n)!.
 * @author Georg Fischer
 */
public class A131491 implements Sequence {

  final Sequence mA039716 = new A039716();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA039716.next());
  }

}

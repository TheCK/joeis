package irvine.oeis.a157;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008846;

/**
 * A157075 Positive integers n for which the Diophantine equation x^2 + y^2 = n^2/2 has relatively prime solutions.
 * @author Georg Fischer
 */
public class A157075 implements Sequence {

  final Sequence mA008846 = new A008846();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA008846.next());
  }

}

package irvine.oeis.a169;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a010.A010052;

/**
 * A169695 a(n) = 1 if n is a square, otherwise a(n) = 2.
 * @author Georg Fischer
 */
public class A169695 implements Sequence {

  final Sequence mA010052 = new A010052();
  @Override
  public Z next() {
    return Z.TWO.subtract(mA010052.next());
  }

}

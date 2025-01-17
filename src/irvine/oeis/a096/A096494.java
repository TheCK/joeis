package irvine.oeis.a096;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000006;

/**
 * A096494 Largest value in the periodic part of the continued fraction of sqrt(prime(n)).
 * @author Georg Fischer
 */
public class A096494 implements Sequence {

  final Sequence mA000006 = new A000006();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA000006.next());
  }

}

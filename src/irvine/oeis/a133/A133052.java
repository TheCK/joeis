package irvine.oeis.a133;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000396;

/**
 * A133052 Cubes of perfect numbers.
 * @author Georg Fischer
 */
public class A133052 implements Sequence {

  final Sequence mA000396 = new A000396();
  @Override
  public Z next() {
    return mA000396.next().pow(Z.THREE);
  }

}

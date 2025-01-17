package irvine.oeis.a061;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A061744 a(n) = (2^A000959(n)) - 1.
 * @author Georg Fischer
 */
public class A061744 implements Sequence {

  final Sequence mA000959 = new A000959();
  @Override
  public Z next() {
    return Z.TWO.pow(mA000959.next()).subtract(Z.ONE);
  }

}

package irvine.oeis.a176;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005384;

/**
 * A176045 Numbers n such that n-1 and 2*n-1 are both prime.
 * @author Georg Fischer
 */
public class A176045 implements Sequence {

  final Sequence mA005384 = new A005384();
  @Override
  public Z next() {
    return mA005384.next().add(Z.ONE);
  }

}

package irvine.oeis.a239;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014689;

/**
 * A239636 Distance between the two occurrences of n-th prime in A082500.
 * @author Georg Fischer
 */
public class A239636 implements Sequence {

  final Sequence mA014689 = new A014689();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA014689.next()).subtract(Z.ONE);
  }

}

package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a022.A022004;

/**
 * A163635 a(n) = 3*A022004(n) + 8.
 * @author Georg Fischer
 */
public class A163635 implements Sequence {

  final Sequence mA022004 = new A022004();
  @Override
  public Z next() {
    return Z.THREE.multiply(mA022004.next()).add(Z.EIGHT);
  }

}

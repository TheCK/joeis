package irvine.oeis.a277;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003714;

/**
 * A277335 Fibbinary numbers multiplied by three: a(n) = 3*A003714(n); Numbers where all 1-bits occur in runs of even length.
 * @author Georg Fischer
 */
public class A277335 implements Sequence {

  final Sequence mA003714 = new A003714();
  @Override
  public Z next() {
    return Z.THREE.multiply(mA003714.next());
  }

}

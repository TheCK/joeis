package irvine.oeis.a066;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a047.A047160;

/**
 * A066285 a(n) is the minimal difference between primes p and q whose sum is 2n.
 * @author Georg Fischer
 */
public class A066285 implements Sequence {

  final Sequence mA047160 = new A047160();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA047160.next());
  }

}

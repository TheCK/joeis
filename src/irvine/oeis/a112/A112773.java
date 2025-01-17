package irvine.oeis.a112;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008578;

/**
 * A112773 3 together with primes multiplied by 3.
 * @author Georg Fischer
 */
public class A112773 implements Sequence {

  final Sequence mA008578 = new A008578();
  @Override
  public Z next() {
    return Z.THREE.multiply(mA008578.next());
  }

}

package irvine.oeis.a247;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.a005.A005361;

/**
 * A247513 Number of elements in the set {(x,y,z): 1&lt;=x,y,z&lt;=n, gcd(x,y,z)=1, lcm(x,y,z)=n}.
 * @author Georg Fischer
 */
public class A247513 implements Sequence {

  final Sequence mA001221 = new A001221();
  final Sequence mA005361 = new A005361();
  @Override
  public Z next() {
    return Z.SIX.pow(mA001221.next()).multiply(mA005361.next());
  }

}

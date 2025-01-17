package irvine.oeis.a145;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003487;

/**
 * A145504 a(n+1)=a(n)^2+2*a(n)-2 and a(1)=4.
 * @author Georg Fischer
 */
public class A145504 implements Sequence {

  final Sequence mA003487 = new A003487();
  @Override
  public Z next() {
    return mA003487.next().subtract(Z.ONE);
  }

}

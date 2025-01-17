package irvine.oeis.a145;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001566;

/**
 * A145502 a(n+1)=a(n)^2+2*a(n)-2 and a(1)=2.
 * @author Georg Fischer
 */
public class A145502 implements Sequence {

  final Sequence mA001566 = new A001566();
  @Override
  public Z next() {
    return mA001566.next().subtract(Z.ONE);
  }

}

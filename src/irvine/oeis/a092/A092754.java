package irvine.oeis.a092;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004754;

/**
 * A092754 a(1)=1, a(2n)=2a(n)+1, a(2n+1)=2a(n)+2.
 * @author Georg Fischer
 */
public class A092754 implements Sequence {

  final Sequence mA004754 = new A004754();
  @Override
  public Z next() {
    return mA004754.next().subtract(Z.ONE);
  }

}

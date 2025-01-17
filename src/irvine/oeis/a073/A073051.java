package irvine.oeis.a073;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a038.A038664;

/**
 * A073051 Least k such that Sum_{i=1..k} (prime(i) + prime(i+2) - 2*prime(i+1)) = 2n + 1.
 * @author Georg Fischer
 */
public class A073051 implements Sequence {

  final Sequence mA038664 = new A038664();
  @Override
  public Z next() {
    return mA038664.next().subtract(Z.ONE);
  }

}

package irvine.oeis.a215;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a141.A141849;

/**
 * A215667 22n+1 is prime.
 * @author Georg Fischer
 */
public class A215667 implements Sequence {

  final Sequence mA141849 = new A141849();
  @Override
  public Z next() {
    return mA141849.next().subtract(Z.ONE).divide(Z.valueOf(22));
  }

}

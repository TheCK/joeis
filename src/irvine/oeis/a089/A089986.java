package irvine.oeis.a089;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a095.A095278;

/**
 * A089986 Numbers n such that 4n + 7 is prime.
 * @author Georg Fischer
 */
public class A089986 implements Sequence {

  final Sequence mA095278 = new A095278();
  @Override
  public Z next() {
    return mA095278.next().subtract(Z.ONE);
  }

}

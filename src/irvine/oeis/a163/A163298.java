package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a029.A029837;

/**
 * A163298 Sum of divisors of n minus binary order of n.
 * @author Georg Fischer
 */
public class A163298 implements Sequence {

  final Sequence mA000203 = new A000203();
  final Sequence mA029837 = new A029837();
  @Override
  public Z next() {
    return mA000203.next().subtract(mA029837.next());
  }

}

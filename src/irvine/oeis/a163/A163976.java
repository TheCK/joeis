package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a141.A141468;

/**
 * A163976 prime(n) -(-1)^(n-th nonprime).
 * @author Georg Fischer
 */
public class A163976 implements Sequence {

  final Sequence mA000040 = new A000040();
  final Sequence mA141468 = new A141468();
  @Override
  public Z next() {
    return mA000040.next().subtract(Z.NEG_ONE.pow(mA141468.next()));
  }

}

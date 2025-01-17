package irvine.oeis.a283;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a157.A157238;

/**
 * A283131 A different representation (1 mapped to 1, 2 mapped to -1) of the Linus sequence (A006345): a(n) "breaks the pattern" by avoiding the longest doubled suffix.
 * @author Georg Fischer
 */
public class A283131 implements Sequence {

  final Sequence mA157238 = new A157238();
  @Override
  public Z next() {
    return Z.ONE.subtract(Z.TWO.multiply(mA157238.next()));
  }

}

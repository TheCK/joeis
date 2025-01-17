package irvine.oeis.a190;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
/**
 * A190004 A190002/2.
 * @author Georg Fischer
 */
public class A190004 implements Sequence {

  private final Sequence mA190002 = new A190002();
  @Override
  public Z next() {
    return mA190002.next().divide(Z.TWO);
  }

}

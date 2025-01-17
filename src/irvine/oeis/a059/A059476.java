package irvine.oeis.a059;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005130;
/**
 * A059476 Number of 4n X 4n quarter-turn symmetric alternating-sign matrices (QTSASM's).
 * @author Georg Fischer
 */
public class A059476 implements Sequence {

  private final Sequence mA005130 = new A005130();
  private final Sequence mA059475 = new A059475();
  @Override
  public Z next() {
    return mA059475.next().multiply(mA005130.next().pow(Z.TWO));
  }

}

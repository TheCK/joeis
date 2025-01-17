package irvine.oeis.a056;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000244;
/**
 * A056577 Difference between 3^n and highest power of 2 less than or equal to 3^n.
 * @author Georg Fischer
 */
public class A056577 implements Sequence {

  private final Sequence mA000244 = new A000244();
  private final Sequence mA056576 = new A056576();
  @Override
  public Z next() {
    return mA000244.next().subtract(Z.TWO.pow(mA056576.next()));
  }

}

package irvine.oeis.a181;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027760;

/**
 * A181904 a(n) = 2*(4^n - 1) / A027760(n).
 * @author Georg Fischer
 */
public class A181904 implements Sequence {

  final Sequence mA027760 = new A027760();
  protected long mN;
  /** Construct the sequence. */
  public A181904() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(Z.FOUR.pow(Z.valueOf(mN)).subtract(Z.ONE)).divide(mA027760.next());
  }

}

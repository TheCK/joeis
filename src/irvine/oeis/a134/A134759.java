package irvine.oeis.a134;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000984;

/**
 * A134759 a(n) = 2*A000984(n) - (n+1).
 * @author Georg Fischer
 */
public class A134759 implements Sequence {

  final Sequence mA000984 = new A000984();
  protected long mN;
  /** Construct the sequence. */
  public A134759() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mA000984.next()).subtract(Z.valueOf(mN).add(Z.ONE));
  }

}

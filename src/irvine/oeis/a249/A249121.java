package irvine.oeis.a249;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007953;
import irvine.oeis.a007.A007954;

/**
 * A249121 a(n) = n - (sum of digits of n) - (product of digits of n).
 * @author Georg Fischer
 */
public class A249121 implements Sequence {

  final Sequence mA007953 = new A007953();
  final Sequence mA007954 = new A007954();
  protected long mN;
  /** Construct the sequence. */
  public A249121() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA007953.next()).subtract(mA007954.next());
  }

}

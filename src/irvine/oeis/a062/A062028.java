package irvine.oeis.a062;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007953;

/**
 * A062028 a(n) = n + sum of the digits of n.
 * @author Georg Fischer
 */
public class A062028 implements Sequence {

  final Sequence mA007953 = new A007953();
  protected long mN;
  /** Construct the sequence. */
  public A062028() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA007953.next());
  }

}

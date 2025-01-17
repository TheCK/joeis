package irvine.oeis.a081;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000203;

/**
 * A081307 a(n) = (n+1)*tau(n) - sigma(n).
 * @author Georg Fischer
 */
public class A081307 implements Sequence {

  final Sequence mA000005 = new A000005();
  final Sequence mA000203 = new A000203();
  protected long mN;
  /** Construct the sequence. */
  public A081307() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(Z.ONE).multiply(mA000005.next()).subtract(mA000203.next());
  }

}

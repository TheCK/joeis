package irvine.oeis.a126;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000010;

/**
 * A126775 <code>a(n) = phi(n)^2 * d(n) = A000010(n)^2 * A000005(n)</code>.
 * @author Georg Fischer
 */
public class A126775 implements Sequence {

  final Sequence mA000005 = new A000005();
  final Sequence mA000010 = new A000010();
  /** Construct the sequence. */
  public A126775() {
  }
  
  @Override
  public Z next() {
    return mA000010.next().pow(Z.TWO).multiply(mA000005.next());
  }

}

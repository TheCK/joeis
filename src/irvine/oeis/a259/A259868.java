package irvine.oeis.a259;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004141;

/**
 * A259868 <code>a(n) = n*A004141(n)</code>.
 * @author Georg Fischer
 */
public class A259868 implements Sequence {

  final Sequence mA004141 = new A004141();
  protected long mN;
  /** Construct the sequence. */
  public A259868() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA004141.next());
  }

}

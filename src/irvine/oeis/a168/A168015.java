package irvine.oeis.a168;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a032.A032741;

/**
 * A168015 a(n) = A000041(n) + n*A032741(n).
 * @author Georg Fischer
 */
public class A168015 implements Sequence {

  final Sequence mA000041 = new A000041();
  final Sequence mA032741 = new A032741();
  protected long mN;
  /** Construct the sequence. */
  public A168015() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000041.next().add(Z.valueOf(mN).multiply(mA032741.next()));
  }

}

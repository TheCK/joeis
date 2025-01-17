package irvine.oeis.a228;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;

/**
 * A228816 Sum of all parts of all partitions of n that contain 1 as a part.
 * @author Georg Fischer
 */
public class A228816 implements Sequence {

  final Sequence mA000041 = new A000041();
  protected long mN;
  /** Construct the sequence. */
  public A228816() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA000041.next());
  }

}

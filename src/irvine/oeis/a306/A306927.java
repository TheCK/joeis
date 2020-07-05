package irvine.oeis.a306;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001615;

/**
 * A306927 <code>a(n) = A001615(n) - n</code>.
 * @author Georg Fischer
 */
public class A306927 implements Sequence {

  final Sequence mA001615 = new A001615();
  protected long mN;
  /** Construct the sequence. */
  public A306927() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA001615.next().subtract(Z.valueOf(mN));
  }

}

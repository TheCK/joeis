package irvine.oeis.a336;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a032.A032153;

/**
 * A336896 Sum of the leftmost parts in all compositions of n into distinct parts.
 * @author Georg Fischer
 */
public class A336896 implements Sequence {

  final Sequence mA032153 = new A032153();
  protected long mN;
  /** Construct the sequence. */
  public A336896() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA032153.next());
  }

}

package irvine.oeis.a167;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a032.A032741;

/**
 * A167934 <code>a(n) = A000041(n) - A032741(n)</code>.
 * @author Georg Fischer
 */
public class A167934 implements Sequence {

  final Sequence mA000041 = new A000041();
  final Sequence mA032741 = new A032741();
  /** Construct the sequence. */
  public A167934() {
  }
  
  @Override
  public Z next() {
    return mA000041.next().subtract(mA032741.next());
  }

}

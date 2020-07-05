package irvine.oeis.a143;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000070;

/**
 * A143229 <code>a(n) = A000041(n) * A000070(n)</code>.
 * @author Georg Fischer
 */
public class A143229 implements Sequence {

  final Sequence mA000041 = new A000041();
  final Sequence mA000070 = new A000070();
  /** Construct the sequence. */
  public A143229() {
  }
  
  @Override
  public Z next() {
    return mA000041.next().multiply(mA000070.next());
  }

}

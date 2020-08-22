package irvine.oeis.a270;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048739;

/**
 * A270388 a(n) = A048739(n-2) mod n.
 * @author Georg Fischer
 */
public class A270388 implements Sequence {

  final Sequence mA048739 = new A048739();
  protected long mN;
  /** Construct the sequence. */
  public A270388() {
    mN = 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA048739.next().mod(Z.valueOf(mN));
  }

}

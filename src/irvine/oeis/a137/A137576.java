package irvine.oeis.a137;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002326;
import irvine.oeis.a006.A006694;

/**
 * A137576 <code>a(n) = A002326(n) * A006694(n) + 1</code>.
 * @author Georg Fischer
 */
public class A137576 implements Sequence {

  final Sequence mA002326 = new A002326();
  final Sequence mA006694 = new A006694();
  /** Construct the sequence. */
  public A137576() {
  }
  
  @Override
  public Z next() {
    return mA002326.next().multiply(mA006694.next()).add(Z.ONE);
  }

}

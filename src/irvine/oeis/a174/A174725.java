package irvine.oeis.a174;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002033;
import irvine.oeis.a008.A008683;

/**
 * A174725 <code>a(n) = (A002033(n-1) + A008683(n))/2</code>.
 * @author Georg Fischer
 */
public class A174725 implements Sequence {

  final Sequence mA002033 = new A002033();
  final Sequence mA008683 = new A008683();
  /** Construct the sequence. */
  public A174725() {
  }
  
  @Override
  public Z next() {
    return mA002033.next().add(mA008683.next()).divide(Z.TWO);
  }

}

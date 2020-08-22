package irvine.oeis.a051;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a000.A000994;

/**
 * A051140 a(n) = (A000110(n) - A000994(n+2))/2.
 * @author Georg Fischer
 */
public class A051140 implements Sequence {

  final Sequence mA000110 = new A000110();
  final Sequence mA000994 = new A000994();
  /** Construct the sequence. */
  public A051140() {
    mA000994.next();
    mA000994.next();
  }
  
  @Override
  public Z next() {
    return mA000110.next().subtract(mA000994.next()).divide(Z.TWO);
  }

}

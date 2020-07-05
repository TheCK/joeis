package irvine.oeis.a133;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008683;

/**
 * A133695 <code>a(n) = 2*A008683 - 1</code>.
 * @author Georg Fischer
 */
public class A133695 implements Sequence {

  final Sequence mA008683 = new A008683();
  /** Construct the sequence. */
  public A133695() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.multiply(mA008683.next()).subtract(Z.ONE);
  }

}

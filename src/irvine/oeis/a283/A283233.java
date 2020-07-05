package irvine.oeis.a283;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000201;

/**
 * A283233 <code>2*A000201</code>.
 * @author Georg Fischer
 */
public class A283233 implements Sequence {

  final Sequence mA000201 = new A000201();
  /** Construct the sequence. */
  public A283233() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.multiply(mA000201.next());
  }

}

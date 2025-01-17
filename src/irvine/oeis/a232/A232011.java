package irvine.oeis.a232;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a067.A067201;

/**
 * A232011 Numbers n such that (3n)^2 + 2 is prime.
 * @author Georg Fischer
 */
public class A232011 implements Sequence {

  final Sequence mA067201 = new A067201();
  /** Construct the sequence. */
  public A232011() {
    mA067201.next();
    mA067201.next();
  }
  
  @Override
  public Z next() {
    return mA067201.next().divide(Z.THREE);
  }

}

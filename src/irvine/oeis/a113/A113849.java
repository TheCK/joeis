package irvine.oeis.a113;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005117;

/**
 * A113849 Numbers whose prime factors are raised to the fourth power.
 * @author Georg Fischer
 */
public class A113849 implements Sequence {

  final Sequence mA005117 = new A005117();
  /** Construct the sequence. */
  public A113849() {
    mA005117.next();
  }
  
  @Override
  public Z next() {
    return mA005117.next().pow(Z.FOUR);
  }

}

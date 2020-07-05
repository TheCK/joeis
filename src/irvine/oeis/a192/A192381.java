package irvine.oeis.a192;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A192381 <code>(A192380)/2</code>.
 * @author Georg Fischer
 */
public class A192381 implements Sequence {

  final Sequence mA192380 = new A192380();
  /** Construct the sequence. */
  public A192381() {
  }
  
  @Override
  public Z next() {
    return mA192380.next().divide(Z.TWO);
  }

}

package irvine.oeis.a307;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.a001.A001222;

/**
 * A307409 a(n) = (A001222(n) - 1)*A001221(n).
 * @author Georg Fischer
 */
public class A307409 implements Sequence {

  final Sequence mA001221 = new A001221();
  final Sequence mA001222 = new A001222();
  /** Construct the sequence. */
  public A307409() {
  }
  
  @Override
  public Z next() {
    return mA001222.next().subtract(Z.ONE).multiply(mA001221.next());
  }

}

package irvine.oeis.a139;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139234 First differences of even superperfect numbers A061652.
 * @author Georg Fischer
 */
public class A139234 implements Sequence {

  final Sequence mA139231 = new A139231();
  @Override
  public Z next() {
    return mA139231.next().divide(Z.TWO);
  }

}

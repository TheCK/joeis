package irvine.oeis.a139;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139242 Second differences of Mersenne numbers A001348, divided by 2.
 * @author Georg Fischer
 */
public class A139242 implements Sequence {

  final Sequence mA139241 = new A139241();
  @Override
  public Z next() {
    return mA139241.next().divide(Z.TWO);
  }

}

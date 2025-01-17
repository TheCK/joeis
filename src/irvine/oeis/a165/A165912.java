package irvine.oeis.a165;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165912 Number of alternating polynomials of degree 3n in GF(2)[X], n&gt;0.
 * @author Georg Fischer
 */
public class A165912 implements Sequence {

  final Sequence mA165920 = new A165920();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA165920.next());
  }

}

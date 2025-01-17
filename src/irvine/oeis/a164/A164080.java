package irvine.oeis.a164;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A164080 Perfect squares one less than a triangular number.
 * @author Georg Fischer
 */
public class A164080 implements Sequence {

  final Sequence mA164055 = new A164055();
  @Override
  public Z next() {
    return mA164055.next().subtract(Z.ONE);
  }

}

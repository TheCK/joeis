package irvine.oeis.a086;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002251;

/**
 * A086482 Beginning with 1, the smallest number not included earlier such that the n-th partial product is an n-th power; or the geometric mean of the first n terms is an integer.
 * @author Georg Fischer
 */
public class A086482 implements Sequence {

  final Sequence mA002251 = new A002251();
  @Override
  public Z next() {
    return Z.TWO.pow(mA002251.next());
  }

}

package irvine.oeis.a198;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a079.A079498;
/**
 * A198680 Multiples of 3 whose sum of base-3 digits are also multiples of 3.
 * @author Georg Fischer
 */
public class A198680 implements Sequence {

  private final Sequence mA079498 = new A079498();
  @Override
  public Z next() {
    return Z.THREE.multiply(mA079498.next());
  }

}

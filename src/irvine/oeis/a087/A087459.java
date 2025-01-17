package irvine.oeis.a087;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014498;

/**
 * A087459 Values (X + Y - Z) sorted on Z, then on Y, where (X,Y,Z) is a primitive Pythagorean triple with X&lt;Y&lt;Z.
 * @author Georg Fischer
 */
public class A087459 implements Sequence {

  final Sequence mA014498 = new A014498();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA014498.next());
  }

}

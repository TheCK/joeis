package irvine.oeis.a243;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027868;

/**
 * A243757 a(n) = Product_{i=1..n} A060904(i).
 * @author Georg Fischer
 */
public class A243757 implements Sequence {

  final Sequence mA027868 = new A027868();
  @Override
  public Z next() {
    return Z.FIVE.pow(mA027868.next());
  }

}

package irvine.oeis.a071;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a035.A035316;

/**
 * A071326 Sum of squares &gt; 1 dividing n.
 * @author Georg Fischer
 */
public class A071326 implements Sequence {

  final Sequence mA035316 = new A035316();
  @Override
  public Z next() {
    return mA035316.next().subtract(Z.ONE);
  }

}

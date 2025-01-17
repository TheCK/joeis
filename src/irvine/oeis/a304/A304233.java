package irvine.oeis.a304;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034684;
import irvine.oeis.a034.A034699;

/**
 * A304233 If n = Product (p_j^k_j) then a(n) = min{p_j^k_j}*max{p_j^k_j}.
 * @author Georg Fischer
 */
public class A304233 implements Sequence {

  final Sequence mA034684 = new A034684();
  final Sequence mA034699 = new A034699();
  @Override
  public Z next() {
    return mA034684.next().multiply(mA034699.next());
  }

}

package irvine.oeis.a100;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034684;
import irvine.oeis.a034.A034699;

/**
 * A100574 If n = product{p|n, p=prime} p^b(p,n), where each b(p,n) is a positive integer and the product is over distinct prime divisors of n, a(n) = difference between the maximum p^b(p,n) and minimum p^b(p,n).
 * @author Georg Fischer
 */
public class A100574 implements Sequence {

  final Sequence mA034684 = new A034684();
  final Sequence mA034699 = new A034699();
  @Override
  public Z next() {
    return mA034699.next().subtract(mA034684.next());
  }

}

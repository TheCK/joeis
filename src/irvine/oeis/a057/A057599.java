package irvine.oeis.a057;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a034.A034841;

/**
 * A057599 a(n) = (n^2)!/(n!)^(n+1); number of ways of dividing n^2 labeled items into n unlabeled boxes of n items each.
 * @author Georg Fischer
 */
public class A057599 implements Sequence {

  final Sequence mA000142 = new A000142();
  final Sequence mA034841 = new A034841();
  @Override
  public Z next() {
    return mA034841.next().divide(mA000142.next());
  }

}

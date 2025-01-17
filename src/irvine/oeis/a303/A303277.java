package irvine.oeis.a303;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001222;
import irvine.oeis.a008.A008472;

/**
 * A303277 If n = Product (p_j^k_j) then a(n) = (Sum (k_j))^(Sum (p_j)).
 * @author Georg Fischer
 */
public class A303277 implements Sequence {

  final Sequence mA001222 = new A001222();
  final Sequence mA008472 = new A008472();
  @Override
  public Z next() {
    return mA001222.next().pow(mA008472.next());
  }

}

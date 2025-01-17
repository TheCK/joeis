package irvine.oeis.a088;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005811;

/**
 * A088748 a(n) = 1 + Sum_{k=0..n-1} 2 * A014577(k) - 1.
 * @author Georg Fischer
 */
public class A088748 implements Sequence {

  final Sequence mA005811 = new A005811();
  @Override
  public Z next() {
    return Z.ONE.add(mA005811.next());
  }

}

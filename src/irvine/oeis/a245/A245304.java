package irvine.oeis.a245;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a022.A022006;

/**
 * A245304 Numbers m such that m+1, m+3, m+7, m+9 and m+13 are all primes.
 * @author Georg Fischer
 */
public class A245304 implements Sequence {

  final Sequence mA022006 = new A022006();
  @Override
  public Z next() {
    return mA022006.next().subtract(Z.ONE);
  }

}

package irvine.oeis.a244;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004125;
import irvine.oeis.a024.A024816;

/**
 * A244048 Antisigma(n) minus the sum of remainders of n mod k, for k = 1,2,3,...,n.
 * @author Georg Fischer
 */
public class A244048 implements Sequence {

  final Sequence mA004125 = new A004125();
  final Sequence mA024816 = new A024816();
  @Override
  public Z next() {
    return mA024816.next().subtract(mA004125.next());
  }

}

package irvine.oeis.a081;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a024.A024702;

/**
 * A081115 (p^2 - 1)/12 where p &gt; 3 runs through the primes.
 * @author Georg Fischer
 */
public class A081115 implements Sequence {

  final Sequence mA024702 = new A024702();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA024702.next());
  }

}

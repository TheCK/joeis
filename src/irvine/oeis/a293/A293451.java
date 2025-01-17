package irvine.oeis.a293;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001826;
import irvine.oeis.a121.A121262;

/**
 * A293451 Number of proper divisors of form 4k+1.
 * @author Georg Fischer
 */
public class A293451 implements Sequence {

  final Sequence mA001826 = new A001826();
  final Sequence mA121262 = new A121262();
  @Override
  public Z next() {
    return mA001826.next().subtract(mA121262.next());
  }

}

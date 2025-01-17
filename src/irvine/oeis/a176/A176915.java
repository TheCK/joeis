package irvine.oeis.a176;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014574;
import irvine.oeis.a078.A078571;

/**
 * A176915 Average of n-th twin prime pair minus total number of prime factors of average of n-th twin prime pair.
 * @author Georg Fischer
 */
public class A176915 implements Sequence {

  final Sequence mA014574 = new A014574();
  final Sequence mA078571 = new A078571();
  @Override
  public Z next() {
    return mA014574.next().subtract(mA078571.next());
  }

}

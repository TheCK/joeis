package irvine.oeis.a075;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001749;
import irvine.oeis.a039.A039702;

/**
 * A075520 4*prime(n) + (prime(n) mod 4).
 * @author Georg Fischer
 */
public class A075520 implements Sequence {

  final Sequence mA001749 = new A001749();
  final Sequence mA039702 = new A039702();
  @Override
  public Z next() {
    return mA001749.next().add(mA039702.next());
  }

}

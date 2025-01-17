package irvine.oeis.a110;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a155.A155067;
import irvine.oeis.a155.A155750;

/**
 * A110854 A155750(n)-A155067(n) = prime(2n+2)-prime(2n+1)-prime(2n)+prime(2n-1).
 * @author Georg Fischer
 */
public class A110854 implements Sequence {

  final Sequence mA155067 = new A155067();
  final Sequence mA155750 = new A155750();
  @Override
  public Z next() {
    return mA155750.next().subtract(mA155067.next());
  }

}

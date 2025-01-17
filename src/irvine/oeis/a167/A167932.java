package irvine.oeis.a167;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a032.A032741;

/**
 * A167932 Number of partitions of n such that all parts are equal or all parts are distinct.
 * @author Georg Fischer
 */
public class A167932 implements Sequence {

  final Sequence mA000009 = new A000009();
  final Sequence mA032741 = new A032741();
  @Override
  public Z next() {
    return mA000009.next().add(mA032741.next());
  }

}

package irvine.oeis.a269;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014606;
import irvine.oeis.a047.A047910;

/**
 * A269113 Number of sequences with 3 copies each of 1,2,...,n avoiding the pattern 12...n.
 * @author Georg Fischer
 */
public class A269113 implements Sequence {

  final Sequence mA014606 = new A014606();
  final Sequence mA047910 = new A047910();
  @Override
  public Z next() {
    return mA014606.next().subtract(mA047910.next());
  }

}

package irvine.oeis.a093;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a006.A006128;

/**
 * A093694 Number of one-element transitions from the partitions of n to the partitions of n+1 for labeled parts.
 * @author Georg Fischer
 */
public class A093694 implements Sequence {

  final Sequence mA000041 = new A000041();
  final Sequence mA006128 = new A006128();
  @Override
  public Z next() {
    return mA000041.next().add(mA006128.next());
  }

}

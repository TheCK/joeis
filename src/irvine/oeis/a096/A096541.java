package irvine.oeis.a096;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000070;
import irvine.oeis.a093.A093694;
/**
 * A096541 Number of parts unequal to 1 in all partitions of the integer n. Also the difference between the labeled and the unlabeled case of one-element transitions from the partitions of n to the partitions of n+1.
 * @author Georg Fischer
 */
public class A096541 implements Sequence {

  private final Sequence mA000070 = new A000070();
  private final Sequence mA093694 = new A093694();
  @Override
  public Z next() {
    return mA093694.next().subtract(mA000070.next());
  }

}

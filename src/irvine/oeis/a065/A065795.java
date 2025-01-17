package irvine.oeis.a065;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051293;
/**
 * A065795 Number of subsets of {1,2,...,n} that contain the average of their elements.
 * @author Georg Fischer
 */
public class A065795 implements Sequence {

  private final Sequence mA051293 = new A051293();
  protected long mN;
  /** Construct the sequence. */
  public A065795() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA051293.next()).divide(Z.TWO);
  }

}

package irvine.oeis.a208;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000070;

/**
 * A208740 Number of multisets that occurring as the peak heights multiset of a Dyck n-path that are the also the peak heights multiset of a smaller Dyck path.
 * @author Georg Fischer
 */
public class A208740 implements Sequence {

  final Sequence mA000070 = new A000070();
  protected long mN;
  /** Construct the sequence. */
  public A208740() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.pow(Z.valueOf(mN).subtract(Z.ONE)).subtract(mA000070.next());
  }

}

package irvine.oeis.a330;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a138.A138137;

/**
 * A330242 Sum of largest emergent parts of the partitions of n.
 * @author Georg Fischer
 */
public class A330242 implements Sequence {

  final Sequence mA138137 = new A138137();
  protected long mN;
  /** Construct the sequence. */
  public A330242() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA138137.next().subtract(Z.valueOf(mN));
  }

}

package irvine.oeis.a226;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045917;

/**
 * A226237 Sum of the parts in the Goldbach partitions of 2n.
 * @author Georg Fischer
 */
public class A226237 implements Sequence {

  final Sequence mA045917 = new A045917();
  protected long mN;
  /** Construct the sequence. */
  public A226237() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(Z.valueOf(mN)).multiply(mA045917.next());
  }

}

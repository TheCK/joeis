package irvine.oeis.a300;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048291;

/**
 * A300757 Number of {0,1} n X n matrices with at least one zero row or column.
 * @author Georg Fischer
 */
public class A300757 implements Sequence {

  final Sequence mA048291 = new A048291();
  protected long mN;
  /** Construct the sequence. */
  public A300757() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.pow(Z.valueOf(mN).pow(Z.TWO)).subtract(mA048291.next());
  }

}

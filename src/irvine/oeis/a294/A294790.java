package irvine.oeis.a294;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014140;

/**
 * A294790 Subtract n from partial sums of partial sums of Catalan numbers.
 * @author Georg Fischer
 */
public class A294790 implements Sequence {

  final Sequence mA014140 = new A014140();
  protected long mN;
  /** Construct the sequence. */
  public A294790() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA014140.next().subtract(Z.valueOf(mN));
  }

}

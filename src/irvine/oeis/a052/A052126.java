package irvine.oeis.a052;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006530;

/**
 * A052126 a(1) = 1; for n&gt;1, a(n)=n/(largest prime dividing n).
 * @author Georg Fischer
 */
public class A052126 implements Sequence {

  final Sequence mA006530 = new A006530();
  protected long mN;
  /** Construct the sequence. */
  public A052126() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).divide(mA006530.next());
  }

}

package irvine.oeis.a220;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a063.A063655;
/**
 * A220114 Largest k &gt;= 0 such that k = n - x - y where n = x*y, x &gt; 0, y &gt; 0, or -1 if no such k exists.
 * @author Georg Fischer
 */
public class A220114 implements Sequence {

  private final Sequence mA063655 = new A063655();
  protected long mN;
  /** Construct the sequence. */
  public A220114() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA063655.next());
  }

}

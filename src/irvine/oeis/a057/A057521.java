package irvine.oeis.a057;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055231;
/**
 * A057521 Powerful (1) part of n: if n = Product_i (pi^ei) then a(n) = Product_{i : ei &gt; 1} (pi^ei); if n=b*c^2*d^3 then a(n)=c^2*d^3 when b is minimized.
 * @author Georg Fischer
 */
public class A057521 implements Sequence {

  private final Sequence mA055231 = new A055231();
  protected long mN;
  /** Construct the sequence. */
  public A057521() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).divide(mA055231.next());
  }

}

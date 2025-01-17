package irvine.oeis.a234;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a112.A112823;

/**
 * A234345 Smallest q such that n &lt;= q &lt; 2n with p, q both prime, p+q = 2n, and p &lt;= q.
 * @author Georg Fischer
 */
public class A234345 implements Sequence {

  final Sequence mA112823 = new A112823();
  protected long mN;
  /** Construct the sequence. */
  public A234345() {
    mN = 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(Z.valueOf(mN)).subtract(mA112823.next());
  }

}

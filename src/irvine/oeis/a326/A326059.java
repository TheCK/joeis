package irvine.oeis.a326;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a285.A285309;
/**
 * A326059 a(n) = A285309(n) - n, where A285309 gives the sum of nonsquare divisors of n.
 * @author Georg Fischer
 */
public class A326059 implements Sequence {

  private final Sequence mA285309 = new A285309();
  protected long mN;
  /** Construct the sequence. */
  public A326059() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA285309.next().subtract(Z.valueOf(mN));
  }

}

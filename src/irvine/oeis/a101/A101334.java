package irvine.oeis.a101;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000272;
import irvine.oeis.a000.A000312;

/**
 * A101334 a(n) = n^n - (n+1)^(n-1).
 * @author Georg Fischer
 */
public class A101334 implements Sequence {

  final Sequence mA000272 = new A000272();
  final Sequence mA000312 = new A000312();
  /** Construct the sequence. */
  public A101334() {
    mA000272.next();
  }
  
  @Override
  public Z next() {
    return mA000312.next().subtract(mA000272.next());
  }

}

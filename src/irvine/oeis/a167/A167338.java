package irvine.oeis.a167;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003959;

/**
 * A167338 Totally multiplicative sequence with a(p) = p*(p+1) = p^2+p for prime p.
 * @author Georg Fischer
 */
public class A167338 implements Sequence {

  final Sequence mA003959 = new A003959();
  protected long mN;
  /** Construct the sequence. */
  public A167338() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA003959.next());
  }

}

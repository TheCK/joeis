package irvine.oeis.a147;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a046.A046933;

/**
 * A147967 a(n) = n*(A001223(n)-1) = n*A046933(n).
 * @author Georg Fischer
 */
public class A147967 implements Sequence {

  final Sequence mA046933 = new A046933();
  protected long mN;
  /** Construct the sequence. */
  public A147967() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA046933.next());
  }

}

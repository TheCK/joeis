package irvine.oeis.a062;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;

/**
 * A062249 a(n) = n + d(n), where d(n) = number of divisors of n, cf. A000005.
 * @author Georg Fischer
 */
public class A062249 implements Sequence {

  final Sequence mA000005 = new A000005();
  protected long mN;
  /** Construct the sequence. */
  public A062249() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA000005.next());
  }

}

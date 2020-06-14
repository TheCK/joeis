package irvine.oeis.a071;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000040;

/**
 * A071168 n-th prime reduced modulo phi(n).
 * @author Georg Fischer
 */
public class A071168 extends A000040 {
  protected long mN = 0;
protected final Sequence mPhi = new A000010();

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.mod(mPhi.next());
  }
}

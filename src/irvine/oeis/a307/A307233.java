package irvine.oeis.a307;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a130.A130032;

/**
 * A307233 a(n) = Product_{k=1..n} (k^2 + k + 1) mod n.
 * @author Georg Fischer
 */
public class A307233 implements Sequence {

  final Sequence mA130032 = new A130032();
  protected long mN;
  /** Construct the sequence. */
  public A307233() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA130032.next().mod(Z.valueOf(mN));
  }

}

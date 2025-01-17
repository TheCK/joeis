package irvine.oeis.a053;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051953;

/**
 * A053158 Sum of n and its cototient function value (A051953): a(n) = 2*n - phi(n), where phi is Euler phi.
 * @author Georg Fischer
 */
public class A053158 implements Sequence {

  final Sequence mA051953 = new A051953();
  protected long mN;
  /** Construct the sequence. */
  public A053158() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA051953.next());
  }

}

package irvine.oeis.a122;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045929;

/**
 * A122798 A P_5-stuttered arithmetic progression with a(n+1) = a(n) if n is a pentagonal number, a(n+1) = a(n)+4 otherwise.
 * @author Georg Fischer
 */
public class A122798 implements Sequence {

  final Sequence mA045929 = new A045929();
  protected long mN;
  /** Construct the sequence. */
  public A122798() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA045929.next().subtract(Z.valueOf(mN)).add(Z.ONE);
  }

}

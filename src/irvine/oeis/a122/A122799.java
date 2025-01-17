package irvine.oeis.a122;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045930;

/**
 * A122799 A P_7-stuttered arithmetic progression with a(n+1)=a(n) if n is not a heptagonal number, a(n+1)=a(n)+2 otherwise.
 * @author Georg Fischer
 */
public class A122799 implements Sequence {

  final Sequence mA045930 = new A045930();
  protected long mN;
  /** Construct the sequence. */
  public A122799() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA045930.next().subtract(Z.valueOf(mN)).add(Z.ONE);
  }

}

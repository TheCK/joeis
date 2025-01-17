package irvine.oeis.a135;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008480;

/**
 * A135323 a(1)=1, a(n) = Sum_{p=prime, p|n} a(n/p)*p.
 * @author Georg Fischer
 */
public class A135323 implements Sequence {

  final Sequence mA008480 = new A008480();
  protected long mN;
  /** Construct the sequence. */
  public A135323() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA008480.next());
  }

}

package irvine.oeis.a092;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a013.A013629;

/**
 * A092783 Ceiling of imaginary parts of zeros of Riemann zeta function.
 * @author Georg Fischer
 */
public class A092783 implements Sequence {

  final Sequence mA013629 = new A013629();
  @Override
  public Z next() {
    return Z.ONE.add(mA013629.next());
  }

}

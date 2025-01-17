package irvine.oeis.a104;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A104365 a(n) = A104350(n) + 1.
 * @author Georg Fischer
 */
public class A104365 implements Sequence {

  final Sequence mA104350 = new A104350();
  @Override
  public Z next() {
    return mA104350.next().add(Z.ONE);
  }

}

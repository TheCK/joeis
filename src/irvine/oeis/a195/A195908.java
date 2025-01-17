package irvine.oeis.a195;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a030.A030703;

/**
 * A195908 Powers of 7 which have no zero in their decimal expansion.
 * @author Georg Fischer
 */
public class A195908 implements Sequence {

  final Sequence mA030703 = new A030703();
  @Override
  public Z next() {
    return Z.SEVEN.pow(mA030703.next());
  }

}

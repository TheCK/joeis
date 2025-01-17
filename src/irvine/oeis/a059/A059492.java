package irvine.oeis.a059;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005156;

/**
 * A059492 Expansion of generating function A_{UO}^(1)(8n).
 * @author Georg Fischer
 */
public class A059492 implements Sequence {

  final Sequence mA005156 = new A005156();
  @Override
  public Z next() {
    return mA005156.next().pow(Z.TWO);
  }

}

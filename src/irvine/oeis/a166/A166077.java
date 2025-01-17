package irvine.oeis.a166;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000326;

/**
 * A166077 a(n)=2^(n(3n-1)/2).
 * @author Georg Fischer
 */
public class A166077 implements Sequence {

  final Sequence mA000326 = new A000326();
  @Override
  public Z next() {
    return Z.TWO.pow(mA000326.next());
  }

}

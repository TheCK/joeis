package irvine.oeis.a131;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a046.A046315;
import irvine.oeis.a100.A100484;

/**
 * A131634 n-th even semiprime minus n-th odd semiprime.
 * @author Georg Fischer
 */
public class A131634 implements Sequence {

  final Sequence mA046315 = new A046315();
  final Sequence mA100484 = new A100484();
  @Override
  public Z next() {
    return mA100484.next().subtract(mA046315.next());
  }

}

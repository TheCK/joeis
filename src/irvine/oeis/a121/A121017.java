package irvine.oeis.a121;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a000.A000670;

/**
 * A121017 Stirling transform of A104600.
 * @author Georg Fischer
 */
public class A121017 implements Sequence {

  final Sequence mA000110 = new A000110();
  final Sequence mA000670 = new A000670();
  @Override
  public Z next() {
    return mA000670.next().multiply(mA000110.next());
  }

}

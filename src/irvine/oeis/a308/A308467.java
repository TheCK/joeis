package irvine.oeis.a308;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a018.A018074;

/**
 * A308467 The smallest positive n-digit 4th power.
 * @author Georg Fischer
 */
public class A308467 implements Sequence {

  final Sequence mA018074 = new A018074();
  @Override
  public Z next() {
    return mA018074.next().pow(Z.FOUR);
  }

}

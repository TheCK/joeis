package irvine.oeis.a051;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a053.A053735;

/**
 * A051329 A generalized Thue-Morse sequence.
 * @author Georg Fischer
 */
public class A051329 implements Sequence {

  final Sequence mA053735 = new A053735();
  @Override
  public Z next() {
    return mA053735.next().mod(Z.FOUR);
  }

}

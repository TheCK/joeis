package irvine.oeis.a060;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000194;
import irvine.oeis.a000.A000196;

/**
 * A060018 a(n) = floor(2*sqrt(n-2)).
 * @author Georg Fischer
 */
public class A060018 implements Sequence {

  final Sequence mA000194 = new A000194();
  final Sequence mA000196 = new A000196();
  @Override
  public Z next() {
    return mA000194.next().add(mA000196.next());
  }

}

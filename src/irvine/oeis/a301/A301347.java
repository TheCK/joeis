package irvine.oeis.a301;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a000.A000169;

/**
 * A301347 a(n) = n^(n-1) + (n-1)!.
 * @author Georg Fischer
 */
public class A301347 implements Sequence {

  final Sequence mA000142 = new A000142();
  final Sequence mA000169 = new A000169();
  @Override
  public Z next() {
    return mA000169.next().add(mA000142.next());
  }

}

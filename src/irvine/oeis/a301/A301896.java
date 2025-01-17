package irvine.oeis.a301;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000788;
import irvine.oeis.a059.A059015;

/**
 * A301896 a(n) = product of total number of 0's and total number of 1's in binary expansions of 0, ..., n.
 * @author Georg Fischer
 */
public class A301896 implements Sequence {

  final Sequence mA000788 = new A000788();
  final Sequence mA059015 = new A059015();
  @Override
  public Z next() {
    return mA059015.next().multiply(mA000788.next());
  }

}

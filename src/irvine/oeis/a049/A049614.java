package irvine.oeis.a049;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a034.A034386;

/**
 * A049614 n! divided by its squarefree kernel.
 * @author Georg Fischer
 */
public class A049614 implements Sequence {

  final Sequence mA000142 = new A000142();
  final Sequence mA034386 = new A034386();
  @Override
  public Z next() {
    return mA000142.next().divide(mA034386.next());
  }

}

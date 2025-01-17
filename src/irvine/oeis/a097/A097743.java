package irvine.oeis.a097;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001348;
import irvine.oeis.a061.A061286;
/**
 * A097743 Numbers of the form 3*2^(p - 1) - 1 where p is prime.
 * @author Georg Fischer
 */
public class A097743 implements Sequence {

  private final Sequence mA001348 = new A001348();
  private final Sequence mA061286 = new A061286();
  @Override
  public Z next() {
    return mA001348.next().add(mA061286.next());
  }

}

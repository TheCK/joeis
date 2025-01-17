package irvine.oeis.a065;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a062.A062298;
/**
 * A065863 Remainder when n-th prime is divided by the number of nonprimes not exceeding n.
 * @author Georg Fischer
 */
public class A065863 implements Sequence {

  private final Sequence mA000040 = new A000040();
  private final Sequence mA062298 = new A062298();
  @Override
  public Z next() {
    return mA000040.next().mod(mA062298.next());
  }

}

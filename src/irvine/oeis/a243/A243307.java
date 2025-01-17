package irvine.oeis.a243;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a066.A066781;
/**
 * A243307 a(n) = 2^phi(n) + phi(n).
 * @author Georg Fischer
 */
public class A243307 implements Sequence {

  private final Sequence mA000010 = new A000010();
  private final Sequence mA066781 = new A066781();
  @Override
  public Z next() {
    return mA066781.next().add(mA000010.next());
  }

}

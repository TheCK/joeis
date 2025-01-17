package irvine.oeis.a338;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a005.A005371;
/**
 * A338638 a(n) = L(L(n)) mod L(n), where L = Lucas numbers = A000032.
 * @author Georg Fischer
 */
public class A338638 implements Sequence {

  private final Sequence mA000032 = new A000032();
  private final Sequence mA005371 = new A005371();

  @Override
  public Z next() {
    return mA005371.next().mod(mA000032.next());
  }

}

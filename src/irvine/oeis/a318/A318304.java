package irvine.oeis.a318;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003557;
import irvine.oeis.a083.A083254;
/**
 * A318304 a(n) = A083254(n)/A003557(n) = (2*A173557(n) - A007947(n)).
 * @author Georg Fischer
 */
public class A318304 implements Sequence {

  private final Sequence mA003557 = new A003557();
  private final Sequence mA083254 = new A083254();
  @Override
  public Z next() {
    return mA083254.next().divide(mA003557.next());
  }

}

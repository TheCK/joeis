package irvine.oeis.a161;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a072.A072670;
/**
 * A161840 Number of noncentral divisors of n.
 * @author Georg Fischer
 */
public class A161840 implements Sequence {

  private final Sequence mA072670 = new A072670();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA072670.next());
  }

}

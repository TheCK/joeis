package irvine.oeis.a070;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a028.A028504;
/**
 * A070254 Perfect squares one more than a palindrome.
 * @author Georg Fischer
 */
public class A070254 implements Sequence {

  private final Sequence mA028504 = new A028504();
  @Override
  public Z next() {
    return mA028504.next().add(Z.ONE);
  }

}

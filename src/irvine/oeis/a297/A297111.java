package irvine.oeis.a297;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
/**
 * A297111 M\u00f6bius transform of A005187, where A005187(n) = 2n - (number of 1's in binary representation of n).
 * @author Georg Fischer
 */
public class A297111 implements Sequence {

  private final Sequence mA000010 = new A000010();
  private final Sequence mA297115 = new A297115();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA000010.next()).subtract(mA297115.next());
  }

}

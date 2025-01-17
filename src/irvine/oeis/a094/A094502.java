package irvine.oeis.a094;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048947;
/**
 * A094502 a(n) = A000203(A046528(n)): sigma of those numbers whose sigma is a power of 2, in order of appearance.
 * @author Georg Fischer
 */
public class A094502 implements Sequence {

  private final Sequence mA048947 = new A048947();
  @Override
  public Z next() {
    return Z.TWO.pow(mA048947.next());
  }

}

package irvine.oeis.a142;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061037;

/**
 * A142590 First trisection of A061037 (Balmer line series of the hydrogen atom).
 * @author Georg Fischer
 */
public class A142590 extends A061037 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}

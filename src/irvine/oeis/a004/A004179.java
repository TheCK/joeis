package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004179 Omit 4's from n.
 * @author Sean A. Irvine
 */
public class A004179 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).replace("4", "");
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}

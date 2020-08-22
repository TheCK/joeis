package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004446 a(n) = Nimsum n + 5.
 * @author Sean A. Irvine
 */
public class A004446 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 5);
  }
}


package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029926 Convert n from degrees Fahrenheit to Centigrade (or Celsius).
 * @author Sean A. Irvine
 */
public class A029926 implements Sequence {

  private Z mN = Z.valueOf(-165);

  @Override
  public Z next() {
    mN = mN.add(5);
    return new Q(mN, Z.NINE).round();
  }
}

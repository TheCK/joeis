package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Italian;

/**
 * A053069 Numbers that in Italian begin with the letter "d".
 * @author Sean A. Irvine
 */
public class A053069 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Italian.SINGLETON.toText(++mN).startsWith("d")) {
        return Z.valueOf(mN);
      }
    }
  }
}

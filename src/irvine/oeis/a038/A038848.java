package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038848 Even numbers that are differences between two cubes in at least one way.
 * @author Sean A. Irvine
 */
public class A038848 implements Sequence {

  private Z mN = Z.valueOf(24);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z lim = mN.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        final Z s = mN.add(x.pow(3));
        s.root(3);
        if (s.auxiliary() == 1) {
          return mN;
        }
      }
    }
  }
}

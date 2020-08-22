package irvine.oeis.a022;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022567 Expansion of Product_{m&gt;=1} (1+x^m)^2.
 * @author Sean A. Irvine
 */
public class A022567 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    int v;
    for (int k = 0; (v = mN - k * (k + 1) / 2) >= 0; ++k) {
      sum = sum.add(IntegerPartition.partitions(v));
    }
    return sum;
  }
}


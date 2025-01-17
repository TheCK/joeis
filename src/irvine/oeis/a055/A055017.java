package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055017 Difference between sums of alternate digits of n starting with the last, i.e., (Sum of ultimate digit of n, antepenultimate digit of n,...)-(sum of penultimate digit of n, preantepenultimate digit of n,...).
 * @author Sean A. Irvine
 */
public class A055017 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    while (m != 0) {
      sum += m % 10;
      m /= 10;
      m = -m;
    }
    return Z.valueOf(sum);
  }
}

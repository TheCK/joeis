package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A054390 Number of ways of writing n as a sum of powers of 3, each power being used at most three times.
 * @author Sean A. Irvine
 */
public class A054390 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    return n % 3 == 0 ? get(n / 3).add(get(n / 3 - 1)) : get(n / 3);
  }
}


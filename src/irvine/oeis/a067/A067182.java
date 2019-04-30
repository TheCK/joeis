package irvine.oeis.a067;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A067182 Smallest Fibonacci number with digit sum n, or <code>-1</code> if no such number exists.
 * @author Sean A. Irvine
 */
public class A067182 extends A000045 {

  private final HashMap<Long, Z> mFirstSolutions = new HashMap<>();
  private long mN = -1;

  private void step() {
    final Z f = super.next();
    final long d = ZUtils.digitSum(f);
    if (!mFirstSolutions.containsKey(d)) {
      mFirstSolutions.put(d, f);
      if (d <= mN) {
        throw new RuntimeException("Heuristic failed: found solution: " + f + " for " + d);
      }
    }
  }

  @Override
  public Z next() {
    // Heuristic, we will find the solution within 2 * Fibonacci numbers.
    // We will detect if this is every violated
    step();
    step();
    final Z res = mFirstSolutions.get(++mN);
    return res == null ? Z.NEG_ONE : res;
  }
}


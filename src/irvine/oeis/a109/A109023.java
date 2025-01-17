package irvine.oeis.a109;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A109023 3-almost primes (A014612) whose digit reversal is different and also has 3 prime factors (with multiplicity). "Emirp Tsolma-3.".
 * @author Georg Fischer
 */
public class A109023 implements Sequence {

  private long mN;
  private final int mCount;

  /** Construct the sequence. */
  public A109023() {
    this(3);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A109023(final int count) {
    mCount = count;
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Cheetah.factor(mN).bigOmega() == mCount) {
        final Z nz = Z.valueOf(mN);
        final Z revn = ZUtils.reverse(nz);
        if (!revn.equals(nz) && Cheetah.factor(revn).bigOmega() == mCount) {
          return nz;
        }
      }
    }
  }
}

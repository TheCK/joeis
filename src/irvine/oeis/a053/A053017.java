package irvine.oeis.a053;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006566;

/**
 * A053017 Let Do(n) = A006566(n) = n-th dodecahedral number. Consider all integer triples (i,j,k), j &gt;= k&gt;0, with Do(i) = Do(j) + Do(k), ordered by increasing i; sequence gives i values.
 * @author Sean A. Irvine
 */
public class A053017 implements Sequence {

  private final MemorySequence mD = MemorySequence.cachedSequence(new A006566());
  private final HashSet<Z> mSet = new HashSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z da = mD.a(mN);
      mSet.add(da);
      for (int k = 1; k < mN; ++k) {
        final Z dk = mD.a(k);
        final Z dj = da.subtract(dk);
        if (dk.compareTo(dj) > 0) {
          break;
        }
        if (mSet.contains(dj)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

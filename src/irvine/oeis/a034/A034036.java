package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034036 Numbers of the form (x^2+xy+2y^2 with x&gt;=0, y&gt;=0).
 * @author Sean A. Irvine
 */
public class A034036 implements Sequence {

  private final TreeSet<Z> mForms = new TreeSet<>();
  private long mX = 0;
  private Z mX2 = Z.ZERO;

  {
    mForms.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (mX2.compareTo(mForms.first()) <= 0) {
      mX2 = Z.valueOf(++mX).square();
      for (long y = 0; y <= mX; ++y) {
        final Z y2 = Z.valueOf(y).square();
        final Z r = mX2.add(y2.multiply2());
        final Z s = Z.valueOf(mX).multiply(y);
        mForms.add(r.add(s));
        final Z t = y2.add(Z.valueOf(mX).square().multiply2());
        mForms.add(t.add(s));
      }
    }
    return mForms.pollFirst();
  }
}

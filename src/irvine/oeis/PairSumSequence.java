package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * Numbers which are the sum of two numbers in another sequence.
 * @author Sean A. Irvine
 */
public class PairSumSequence implements Sequence {

  private final MemorySequence mSeq;
  private Z mT;
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  /**
   * Construct the sequence.
   * @param seq underlying sequence
   */
  public PairSumSequence(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
    mT = mSeq.next();
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mT)) {
        int t = 0;
        Z u;
        do {
          u = mSeq.get(t++);
          mA.add(mT.add(u));
        } while (!u.equals(mT));
        mT = mSeq.next();
      }
      if (mA.remove(mN)) {
        return mN;
      }
    }
  }
}

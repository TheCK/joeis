package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence generating the continued fraction of a computable real.
 * @author Sean A. Irvine
 */
public class ContinuedFractionSequence implements Sequence {

  private final DecimalExpansionSequence mSeq;
  private final int mAccuracy;
  protected long mN = -1;

  /**
   * Construct the sequence.
   * @param seq underlying decimal expansion sequence
   * @param accuracy accuracy to pass down
   */
  public ContinuedFractionSequence(final DecimalExpansionSequence seq, final int accuracy) {
    mSeq = seq;
    mAccuracy = accuracy;
  }

  /**
   * Construct the sequence.
   * @param seq underlying decimal expansion sequence
   */
  public ContinuedFractionSequence(final DecimalExpansionSequence seq) {
    this(seq, 500);
  }

  /**
   * Construct a continued fraction expansion from an existing sequence.
   * Only works for an underlying sequence consisting of single digits.
   * @param seq underlying sequence
   */
  public ContinuedFractionSequence(final Sequence seq) {
    this(seq, 10);
  }

  /**
   * Construct a continued fraction expansion from an existing sequence.
   * Only works for an underlying sequence consisting of single digits.
   * @param seq underlying sequence
   * @param base sequence yields digits in this base
   */
  public ContinuedFractionSequence(final Sequence seq, final int base) {
    this(new DecimalExpansionSequence(1, new CR() {
      private static final int EXTRA_PRECISION = 5;
      private Z mNum = Z.ZERO;
      private Z mDen = Z.ONE;
      private final Z mBase = Z.valueOf(base);

      @Override
      protected Z approximate(final int precision) {
        final int wp = EXTRA_PRECISION - precision;
        while (mNum.bitLength() <= wp) {
          final Z digit = seq.next();
          if (digit.compareTo(mBase) >= 0) {
            throw new UnsupportedOperationException("Value too large in underlying sequence: " + digit);
          }
          mNum = mNum.multiply(base).add(digit);
          mDen = mDen.multiply(base);
        }
        return CR.valueOf(new Q(mNum, mDen)).getApprox(precision);
      }
    }), 1000);
  }

  @Override
  public Z next() {
    mSeq.next(); // ensure precision
    // Re-step every time due to changing precision
    final Convergents conv = new Convergents(mSeq.getCR(), mAccuracy);
    ++mN;
    for (int k = 0; k <= mN; ++k) {
      conv.next();
    }
    return conv.frac();
  }

}

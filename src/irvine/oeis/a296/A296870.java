package irvine.oeis.a296;
// Generated by gen_seq4.pl baspitpeak at 2021-08-24 17:53

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A296870 Numbers n whose base-6 digits d(m), d(m-1), ..., d(0) have #(pits) = #(peaks); see Comments.
 * @author Georg Fischer
 */
public class A296870 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A296870() {
    super(1);
  }

  @Override
  protected boolean isOk() {
    return signumPitsPeaks(mK, 6) == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

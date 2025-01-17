package irvine.oeis.a296;
// Generated by gen_seq4.pl baspitpeak at 2021-08-24 17:53

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A296858 Numbers whose base-2 digits have #(pits) = #(peaks); see Comments.
 * @author Georg Fischer
 */
public class A296858 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A296858() {
    super(1);
  }

  @Override
  protected boolean isOk() {
    return signumPitsPeaks(mK, 2) == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

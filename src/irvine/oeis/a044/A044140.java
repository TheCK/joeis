package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 0 2 7 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044140 Numbers k such that substring "02" occurs in the base-7 representation of k but not of k-1.
 * @author Georg Fischer
 */
public class A044140 extends RunsBaseSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  private static final String P12 = "02";

  /** Construct the sequence. */
  public A044140() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(7).contains(P12)
      && !mK.
      subtract(Z.ONE).toString(7).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

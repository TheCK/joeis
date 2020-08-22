package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 2 4 7 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044156 Numbers n such that string 2,4 occurs in the base 7 representation of n but not of n-1.
 * @author Georg Fischer
 */
public class A044156 extends RunsBaseSequence {

  private static final String P12 = "24";

  /** Construct the sequence. */
  public A044156() {
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

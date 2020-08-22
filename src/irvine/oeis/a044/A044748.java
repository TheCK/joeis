package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 3 5 10 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044748 Numbers n such that string 3,5 occurs in the base 10 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044748 extends RunsBaseSequence {

  private static final String P12 = "35";

  /** Construct the sequence. */
  public A044748() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(10).contains(P12)
      && !mK.
      add(Z.ONE).toString(10).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

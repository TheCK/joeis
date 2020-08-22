package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 6 5 8 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044621 Numbers n such that string 6,5 occurs in the base 8 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044621 extends RunsBaseSequence {

  private static final String P12 = "65";

  /** Construct the sequence. */
  public A044621() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(8).contains(P12)
      && !mK.
      add(Z.ONE).toString(8).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

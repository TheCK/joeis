package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 8 7 10 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044800 Numbers n such that string 8,7 occurs in the base 10 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044800 extends RunsBaseSequence {

  private static final String P12 = "87";

  /** Construct the sequence. */
  public A044800() {
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

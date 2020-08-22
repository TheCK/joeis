package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 4 2 10 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044755 Numbers n such that string 4,2 occurs in the base 10 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044755 extends RunsBaseSequence {

  private static final String P12 = "42";

  /** Construct the sequence. */
  public A044755() {
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

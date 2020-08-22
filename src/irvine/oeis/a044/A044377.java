package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 4 5 10 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044377 Numbers n such that string 4,5 occurs in the base 10 representation of n but not of n-1.
 * @author Georg Fischer
 */
public class A044377 extends RunsBaseSequence {

  private static final String P12 = "45";

  /** Construct the sequence. */
  public A044377() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(10).contains(P12)
      && !mK.
      subtract(Z.ONE).toString(10).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

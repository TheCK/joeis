package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 1 2 7 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044528 Numbers n such that string 1,2 occurs in the base 7 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044528 extends RunsBaseSequence {

  private static final String P12 = "12";

  /** Construct the sequence. */
  public A044528() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(7).contains(P12)
      && !mK.
      add(Z.ONE).toString(7).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

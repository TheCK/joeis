package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 2 2 4 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044452 Numbers n such that string 2,2 occurs in the base 4 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044452 extends RunsBaseSequence {

  private static final String P12 = "22";

  /** Construct the sequence. */
  public A044452() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(4).contains(P12)
      && !mK.
      add(Z.ONE).toString(4).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

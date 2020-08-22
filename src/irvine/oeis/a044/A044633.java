package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 0 1 9 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044633 Numbers n such that string 0,1 occurs in the base 9 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044633 extends RunsBaseSequence {

  private static final String P12 = "01";

  /** Construct the sequence. */
  public A044633() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(9).contains(P12)
      && !mK.
      add(Z.ONE).toString(9).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

package irvine.oeis.a044;
// Generated by gen_seq4.pl juxdigost 0 0 3 at 2019-07-04 09:23
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A044433 Numbers n such that string 0,0 occurs in the base 3 representation of n but not of n+1.
 * @author Georg Fischer
 */
public class A044433 extends RunsBaseSequence {

  private static final String P12 = "00";

  /** Construct the sequence. */
  public A044433() {
    super(1, -1);
  }

  @Override
  protected boolean isOk() {
    return mK.toString(3).contains(P12)
      && !mK.
      add(Z.ONE).toString(3).contains(P12);
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

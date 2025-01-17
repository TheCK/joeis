package irvine.oeis.a296;
// Generated by gen_seq4.pl basraifal at 2021-08-24 17:24

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A296752 Numbers n whose base-13 digits d(m), d(m-1), ..., d(0) have #(rises) &lt; #(falls); see Comments.
 * @author Georg Fischer
 */
public class A296752 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A296752() {
    super(1);
  }

  @Override
  protected boolean isOk() {
    return signumRaisesFalls(mK, 13) == -1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

package irvine.oeis.a296;
// Generated by gen_seq4.pl basraifal at 2021-08-24 17:24

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A296691 Numbers n whose base-3 digits d(m), d(m-1), ... d(0) have #(rises) = #(falls); see Comments.
 * @author Georg Fischer
 */
public class A296691 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A296691() {
    super(1);
  }

  @Override
  protected boolean isOk() {
    return signumRaisesFalls(mK, 3) == 0;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

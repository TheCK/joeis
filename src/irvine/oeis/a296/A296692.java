package irvine.oeis.a296;
// Generated by gen_seq4.pl basraifal at 2021-08-24 17:24

import irvine.math.z.Z;
import irvine.oeis.RunsBaseSequence;

/**
 * A296692 Numbers n whose base-3 digits d(m), d(m-1), ... d(0) have #(rises) &gt; #(falls); see Comments.
 * @author Georg Fischer
 */
public class A296692 extends RunsBaseSequence {

  /** Construct the sequence. */
  public A296692() {
    super(1);
  }

  @Override
  protected boolean isOk() {
    return signumRaisesFalls(mK, 3) == 1;
  }

  @Override
  public Z next() {
    return getNextWithProperty();
  }
}

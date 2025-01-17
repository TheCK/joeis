package irvine.oeis.a299;
// Generated by gen_seq4.pl compleq at 2020-09-30 11:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;


/**
 * A299488 Solution a( ) of the complementary equation a(n) = b(n-1) + b(n-2) + b(n-3), where a(0) = 1, a(1) = 2, a(2) = 4; see Comments.
 * @author Georg Fischer
 */
public class A299488 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A299488() {
    super(0, "[[0],[-1]]", new String[]{"[1, 2, 4]", "[]"});
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(b(n - 3) + b(n - 2) + b(n - 1));
  }

}

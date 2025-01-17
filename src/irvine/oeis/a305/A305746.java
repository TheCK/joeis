package irvine.oeis.a305;
// Generated by gen_seq4.pl compleq at 2020-09-30 11:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;


/**
 * A305746 Solution of the complementary equation a(n) = 2*a(n-1) - a(n-3) + b(n), where a(0) = 1, a(1) = 2, a(2) = 3, b(0)= 4, b(1) = 5, b(2) = 6; b(3) = 7. See Comments.
 * @author Georg Fischer
 */
public class A305746 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A305746() {
    super(0, "[[0],[-1],[0],[2],[-1]]", new String[]{"[1, 2, 3]", "[4, 5, 6, 7]"});
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(b(n));
  }

}

package irvine.oeis.a297;
// Generated by gen_seq4.pl compleq at 2020-09-30 11:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;


/**
 * A297997 Solution (b(n)) of the near-complementary equation a(n) = a(1)*b(n-1) - a(0)*b(n-2) + n, where a(0) = 1, a(1) = 2, b(0) = 3, b(1) = 4, and (b(n)) is the increasing sequence of positive integers not in (a(n)).  See Comments.
 * @author Georg Fischer
 */
public class A297997 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A297997() {
    super(1, "[[0, 1],[-1]]", new String[]{"[1, 2]", "[3, 4]"});
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(2 * b(n - 1) - 1 * b(n - 2));
  }

}

package irvine.oeis.a296;
// Generated by gen_seq4.pl compleq at 2020-09-30 11:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;


/**
 * A296289 Solution of the complementary equation a(n) = a(n-1) + a(n-2) + n*b(n-1), where a(0) = 1, a(1) = 3, b(0) = 2, b(1) = 4, and (a(n)) and (b(n)) are increasing complementary sequences.
 * @author Georg Fischer
 */
public class A296289 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A296289() {
    super(0, "[[0],[1],[1],[-1]]", new String[]{"[1, 3]", "[2, 4]"});
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(n * b(n - 1));
  }

}

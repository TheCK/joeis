package irvine.oeis.a294;
// Generated by gen_seq4.pl compl_z at 2020-09-30 11:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;


/**
 * A294384 Solution of the complementary equation a(n) = a(n-1)*b(n-2) - n, where a(0) = 1, a(1) = 3, b(0) = 2, b(1) = 4.
 * @author Georg Fischer
 */
public class A294384 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A294384() {
    super(0, "[[0,-1],[-1]]", new String[]{"[1, 3]", "[2, 4]"});
  }

  @Override
  public Z adjunct(final int n) {
    return aZ(n - 1).multiply(Z.valueOf(b(n - 2)));
  }

}

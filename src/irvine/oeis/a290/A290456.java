package irvine.oeis.a290;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a173.A173018;


/**
 * A290456 Triangle formed by reading the triangle of Eulerian numbers <code>(A173018) mod 6</code>.
 * @author Georg Fischer
 */
public class A290456 extends A173018 {

  /** Construct the sequence. */
  public A290456() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.SIX);
  }
}

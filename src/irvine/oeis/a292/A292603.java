package irvine.oeis.a292;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a005.A005940;


/**
 * A292603 Doudna-tree reduced modulo 4: a(n) = A005940(1+n) mod 4.
 * @author Georg Fischer
 */
public class A292603 extends A005940 {

  /** Construct the sequence. */
  public A292603() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.FOUR);
  }
}

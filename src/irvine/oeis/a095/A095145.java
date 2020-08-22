package irvine.oeis.a095;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;


/**
 * A095145 Triangle formed by reading Pascal's triangle (A007318) mod 12.
 * @author Georg Fischer
 */
public class A095145 extends A007318 {

  /** Construct the sequence. */
  public A095145() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(12));
  }
}

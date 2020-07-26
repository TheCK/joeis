package irvine.oeis.a065;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007913;


/**
 * A065882 Ultimate modulo <code>4: right-hand</code> nonzero digit of n when written in base 4.
 * @author Georg Fischer
 */
public class A065882 extends A007913 {

  /** Construct the sequence. */
  public A065882() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.FOUR);
  }
}

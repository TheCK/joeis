package irvine.oeis.a258;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;


/**
 * A258711 Motzkin numbers <code>A001006</code> read <code>mod 7</code>.
 * @author Georg Fischer
 */
public class A258711 extends A001006 {

  /** Construct the sequence. */
  public A258711() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.SEVEN);
  }
}

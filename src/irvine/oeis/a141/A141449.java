package irvine.oeis.a141;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a005.A005439;


/**
 * A141449 <code>A005439 mod 9</code>.
 * @author Georg Fischer
 */
public class A141449 extends A005439 {

  /** Construct the sequence. */
  public A141449() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.NINE);
  }
}

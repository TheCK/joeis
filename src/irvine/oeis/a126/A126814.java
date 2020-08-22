package irvine.oeis.a126;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;


/**
 * A126814 Ramanujan numbers (A000594) read mod 16.
 * @author Georg Fischer
 */
public class A126814 extends A000594 {

  /** Construct the sequence. */
  public A126814() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(16));
  }
}

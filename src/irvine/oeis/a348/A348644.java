package irvine.oeis.a348;
// Generated by gen_seq4.pl linrec/linrec2 at 2022-04-29 22:30
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A348644 a(n) = (18*n + 1)*(24*n + 1)*(144*n + 11).
 * @author Georg Fischer
 */
public class A348644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A348644() {
    super(new Z[] {new Z("-1"), new Z("4"), new Z("-6"), new Z("4")}, new Z[] {new Z("11"), new Z("73625"), new Z("542087"), new Z("1778645")});
  }
}

package irvine.oeis.a348;
// Generated by gen_seq4.pl linrec/linrec2 at 2022-04-29 22:30
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A348621 The number of additions required to compute the permanent of general n X n matrices using Ryser's formula without Gray code ordering.
 * @author Georg Fischer
 */
public class A348621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A348621() {
    super(new Z[] {new Z("8"), new Z("-28"), new Z("38"), new Z("-25"), new Z("8")}, new Z[] {new Z("0"), new Z("4"), new Z("21"), new Z("82"), new Z("275")});
  }
}

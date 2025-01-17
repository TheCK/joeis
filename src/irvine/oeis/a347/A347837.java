package irvine.oeis.a347;
// Generated by gen_seq4.pl linrec/linrec2 at 2022-04-29 22:30
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A347837 a(n) = 32*(n + floor(n/3)) - 11; third column of A347834.
 * @author Georg Fischer
 */
public class A347837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A347837() {
    super(new Z[] {new Z("-1"), new Z("1"), new Z("0"), new Z("1")}, new Z[] {new Z("21"), new Z("53"), new Z("117"), new Z("149")});
  }
}

package irvine.oeis.a348;
// Generated by gen_seq4.pl linrec/linrec2 at 2022-04-29 22:30
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A348309 a(n) = Sum_{k=0..floor(n/8)} (-1)^k * binomial(n-4*k,4*k).
 * @author Georg Fischer
 */
public class A348309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A348309() {
    super(new Z[] {new Z("-1"), new Z("0"), new Z("0"), new Z("0"), new Z("-1"), new Z("4"), new Z("-6"), new Z("4")}, new Z[] {new Z("1"), new Z("1"), new Z("1"), new Z("1"), new Z("1"), new Z("1"), new Z("1"), new Z("1")});
  }
}

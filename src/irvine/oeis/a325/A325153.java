package irvine.oeis.a325;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (8-3*(3-8*x)*exp(x)+exp(9*x))/24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A325153 A column of triangle A322220; a(n) = A322220(n,1) for n &gt;= 1.
 * @author Georg Fischer
 */
public class A325153 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A325153() {
    super(1, "[[0],[0,18],[27,7,-20],[-24,-32,-6,2],[6,11,6,1]]", "[1,5,33,277,2465]", 3);
    setGfType(1);
  }
}

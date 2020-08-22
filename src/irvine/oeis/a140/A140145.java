package irvine.oeis.a140;
// Generated by gen_seq4.pl holos [[0],[-1],[1],[4],[-4],[-6],[6],[4],[-4],[-1],[1]] [1,9,12,76,81,297,304,816,825,1825] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A140145 a(1)=1, a(n)=a(n-1)+n^1 if n odd, a(n)=a(n-1)+ n^3 if n is even.
 * @author Georg Fischer
 */
public class A140145 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140145() {
    super(1, "[[0],[-1],[1],[4],[-4],[-6],[6],[4],[-4],[-1],[1]]", "[1,9,12,76,81,297,304,816,825,1825]", 0);
  }
}

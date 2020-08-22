package irvine.oeis.a140;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[-3],[3],[3],[-3],[-1],[1]] [1,2,11,12,37,38,87,88] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A140148 a(1)=1, a(n)=a(n-1)+n^2 if n odd, a(n)=a(n-1)+ n^0 if n is even.
 * @author Georg Fischer
 */
public class A140148 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140148() {
    super(1, "[[0],[1],[-1],[-3],[3],[3],[-3],[-1],[1]]", "[1,2,11,12,37,38,87,88]", 0);
  }
}

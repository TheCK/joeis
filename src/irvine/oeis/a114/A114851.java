package irvine.oeis.a114;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x-x^2+x^3-sqrt((1+x-x^2-x^3)^2-4*(x-2*x^3+x^4)))/(2*(x^2-x^3))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A114851 Number of lambda calculus terms of size n, where size(lambda x.M) = 2 + size(M), size(M N) = 2 + size(M) + size(N), and size(V) = 1 + i for a variable V bound by the i-th enclosing lambda (corresponding to a binary encoding).
 * @author Georg Fischer
 */
public class A114851 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114851() {
    super(0, "[[0],[0,1,1],[4,6,2],[18,4,-2],[52,34,6],[-614,-242,-24],[1102,364,30],[-866,-248,-18],[-74,-28,-2],[710,181,11],[-308,-72,-4]]", "[0,0,1,1,2,2,4,5,10,14,27]", 9);
  }
}

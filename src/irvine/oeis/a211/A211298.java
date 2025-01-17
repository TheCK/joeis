package irvine.oeis.a211;
// Generated by gen_seq4.pl holos at 2021-06-13 21:50
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A211298 a(n) = number of n-lettered words in the alphabet {1, 2, 3} with as many occurrences of the substring (consecutive subword) [1, 2, 1] as of [2, 1, 2].
 * Recurrence: -a(n)*n+((7*n-5)*a(n-1)-(14*n-26)*a(n-2)-(n+24)*a(n-3)+(29*n-69)*a(n-4)-(20*n-112)*a(n-5)-(20*n-68)*a(n-6)+(20*n-108)*a(n-7)+(12*n-60)*a(n-8))
 * @author Georg Fischer
 */
public class A211298 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A211298() {
    super(0, "[[0],[-60, 12],[-108, 20],[68,-20],[112,-20],[-69, 29],[-24,-1],[26,-14],[-5, 7],[0,-1]]", "[1, 3, 9, 25, 73, 209, 603, 1737]", 0);
  }
}

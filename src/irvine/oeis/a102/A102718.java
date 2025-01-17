package irvine.oeis.a102;
// Generated by gen_seq4.pl holos at 2021-06-06 21:33
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A102718 a(n) = a(n-1) + (sum of the last two digits of the sequence so far); a(0)=0; a(1)=1.
 * Recurrence: a(n+20)=200+a(n)
 * @author Georg Fischer
 */
public class A102718 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102718() {
    super(0, "[[200],[1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1]]", "0, 1, 2, 5, 12, 15, 21, 24, 30, 33, 39, 51, 57, 69, 84, 96, 111, 113, 117, 125, 132, 137, 147, 158, 171, 179, 195, 209, 218, 227, 236, 245, 254, 263, 272, 281, 290, 299, 317", 0);
  }
}

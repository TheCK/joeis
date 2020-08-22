package irvine.oeis.a129;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1+(2*x^2)/(-1+4*x-2*x^2+sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A129775 Number of maximally clustered permutations in S_n; the maximally clustered permutations are those that avoid 3421, 4312 and 4321.
 * @author Georg Fischer
 */
public class A129775 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A129775() {
    super(0, "[[0],[24,40,16],[102,-22,-40],[-1176,-605,-47],[3258,1768,238],[-3864,-1840,-220],[2052,835,85],[-486,-171,-15],[42,13,1]]", "[1,1,2,6,21,78,298,1157,4539]", 7);
  }
}

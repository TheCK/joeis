package irvine.oeis.a330;
// Generated by gen_seq4.pl holos at 2021-06-05 23:57
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A330127 Number of length-n binary words containing at most distinct 11 palindromes as subwords (including the empty word).
 * Recurrence: a(n)=-a(n-1)-a(n-2)-a(n-3)-a(n-4)-a(n-5)+2*a(n-6)+4*a(n-7)+5*a(n-8)+5*a(n-9)+5*a(n-10)+5*a(n-11)+2*a(n-12)-3*a(n-13)+-6*a(n-14)-8*a(n-15)-8*a(n-16)-8*a(n-17)-7*a(n-18)-3*a(n-19)+3*a(n-21)+4*a(n-22)+4*a(n-23)+4*a(n-24)+3*a(n-25)+2*a(n-26)+a(n-27)
 * @author Georg Fischer
 */
public class A330127 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330127() {
    super(0, "[[0],[1],[2],[3],[4],[4],[4],[3],[0],[-3],[-7],[-8],[-8],[-8],[-6],[-3],[2],[5],[5],[5],[5],[4],[2],[-1],[-1],[-1],[-1],[-1],[-1]]", "1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 292, 270, 268, 276, 276, 288, 320, 340, 364, 388, 404, 428, 476, 512, 560, 610, 644, 692, 768, 840, 924, 1020, 1100, 1190, 1316, 1452, 1612, 1786, 1952, 2134, 2348, 2598, 2896", 0);
  }
}

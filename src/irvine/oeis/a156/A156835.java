package irvine.oeis.a156;
// Generated by gen_seq4.pl holos [[0],[1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-6],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]] [593,595,623,637,697,707,733,833,965,1015,1037,1225,1295,1547,1585,1973,2023,2443,2597,3145,3227,3433,4165,5057,5383,5525,6713,7147,8687,8917,11245] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=6*a[n-15]-a[n-30]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A156835 Positive numbers y such that y^2 is of the form x^2+(x+833)^2 with integer x.
 * @author Georg Fischer
 */
public class A156835 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156835() {
    super(1, "[[0],[1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-6],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]]", "[593,595,623,637,697,707,733,833,965,1015,1037,1225,1295,1547,1585,1973,2023,2443,2597,3145,3227,3433,4165,5057,5383,5525,6713,7147,8687,8917,11245]", 0);
  }
}

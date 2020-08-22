package irvine.oeis.a331;
// Generated by gen_seq4.pl holos [[0],[-32],[0],[80],[0],[-80],[0],[40],[0],[-10],[0],[1]] [0,0,0,0,0,0,8,16,80,160,480] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=10*a[n-2]-40*a[n-4]+80*a[n-6]-80*a[n-8]+32*a[n-10]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A331419 a(n) is the number of subsets of {1..n} that contain 4 odd numbers.
 * @author Georg Fischer
 */
public class A331419 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331419() {
    super(1, "[[0],[-32],[0],[80],[0],[-80],[0],[40],[0],[-10],[0],[1]]", "[0,0,0,0,0,0,8,16,80,160,480]", 0);
  }
}

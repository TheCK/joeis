package irvine.oeis.a331;
// Generated by gen_seq4.pl holos [[0],[16],[0],[-32],[0],[24],[0],[-8],[0],[1]] [0,0,0,0,4,8,32,64,160] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=8*a[n-2]-24*a[n-4]+32*a[n-6]-16*a[n-8]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A331408 Number of subsets of {1..n} that contain three odd numbers.
 * @author Georg Fischer
 */
public class A331408 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331408() {
    super(1, "[[0],[16],[0],[-32],[0],[24],[0],[-8],[0],[1]]", "[0,0,0,0,4,8,32,64,160]", 0);
  }
}

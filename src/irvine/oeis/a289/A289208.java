package irvine.oeis.a289;
// Generated by gen_seq4.pl holos [[0],[-99792,-5994,148473,-90396,15309],[-385356,-16878,558936,-338202,56700],[55392,27472,-137904,92048,-17808],[576,-3680,7680,-5920,1344]] [0,1,6,40,268] 0 at 2020-03-14 22:45
// Recurrence: 32*(n-1)*(2*n-1)*(3*n-1)*(7*n-18)*a[n+0]=16*(1113*n^4-5753*n^3+8619*n^2-1717*n-3462)*a[n-1]-6*(9450*n^4-56367*n^3+93156*n^2-2813*n-64226)*a[n-2]-81*(3*n-8)*(3*n-7)*(3*n+2)*(7*n-11)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A289208 Number of rooted essentially 4-connected toroidal triangulations with n vertices.
 * @author Georg Fischer
 */
public class A289208 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A289208() {
    super(0, "[[0],[-99792,-5994,148473,-90396,15309],[-385356,-16878,558936,-338202,56700],[55392,27472,-137904,92048,-17808],[576,-3680,7680,-5920,1344]]", "[0,1,6,40,268]", 0);
  }
}

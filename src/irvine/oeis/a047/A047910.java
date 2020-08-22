package irvine.oeis.a047;
// Generated by gen_seq4.pl holos [[0],[80640,-617184,2120040,-4313196,5773734,-5339007,3479958,-1598895,507546,-106029,13122,-729],[4320,-27312,73902,-111222,100938,-55542,17226,-2202,-162,54],[384,-1460,1848,-684,-264,232,-40],[-96,128,-56,8]] [1,1,19,1306] 0 at 2020-02-15 22:07
// Recurrence: 8*(n-3)*(n-2)^2*a[n+0]=4*(n-3)*(10*n^5-28*n^4-18*n^3+117*n^2-111*n+32)*a[n-1]-6*(n-1)^3*(3*n-5)*(3*n-4)*(n^4+3*n^3-37*n^2+71*n-36)*a[n-2]+9*(n-2)^3*(n-1)^4*(3*n-8)*(3*n-7)*(3*n-5)*(3*n-4)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A047910 Number of words on {1,1,1,2,2,2,...,n,n,n} with longest increasing subsequence of length n.
 * @author Georg Fischer
 */
public class A047910 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A047910() {
    super(0, "[[0],[80640,-617184,2120040,-4313196,5773734,-5339007,3479958,-1598895,507546,-106029,13122,-729],[4320,-27312,73902,-111222,100938,-55542,17226,-2202,-162,54],[384,-1460,1848,-684,-264,232,-40],[-96,128,-56,8]]", "[1,1,19,1306]", 0);
  }
}

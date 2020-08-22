package irvine.oeis.a242;
// Generated by gen_seq4.pl holos [[0],[-1008,-28254,66537,-54789,19251,-2457],[-24,33274,-75435,62005,-21921,2821],[24,-33274,75435,-62005,21921,-2821],[-1032,5020,-8898,7216,-2670,364]] [0,1,3,13,67] 0 at 2020-03-14 22:45
// Recurrence: 2*(n-1)*(2*n-1)*(91*n^3-531*n^2+962*n-516)*a[n+0]=(2821*n^5-21921*n^4+62005*n^3-75435*n^2+33274*n-24)*a[n-1]-(2821*n^5-21921*n^4+62005*n^3-75435*n^2+33274*n-24)*a[n-2]+3*(3*n-8)*(3*n-7)*(91*n^3-258*n^2+173*n+6)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A242798 Expansion of -x*d(log((1-x*(2/sqrt(3*x)) * sin((1/3) * arcsin(sqrt(27*x/4))))))/dx.
 * @author Georg Fischer
 */
public class A242798 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A242798() {
    super(0, "[[0],[-1008,-28254,66537,-54789,19251,-2457],[-24,33274,-75435,62005,-21921,2821],[24,-33274,75435,-62005,21921,-2821],[-1032,5020,-8898,7216,-2670,364]]", "[0,1,3,13,67]", 0);
  }
}

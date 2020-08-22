package irvine.oeis.a121;
// Generated by gen_seq4.pl holos [[0],[698880,-950528,516256,-139968,18944,-1024],[139079,-170816,79120,-16384,1280],[13350,-14276,5184,-640],[811,-704,160],[34,-20],[1]] [1,5,46,613,10679,229576,5868715] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*(10*n-17)*a[n-1]-(160*n^2-704*n+811)*a[n-2]+2*(320*n^3-2592*n^2+7138*n-6675)*a[n-3]-(1280*n^4-16384*n^3+79120*n^2-170816*n+139079)*a[n-4]+32*(n-4)^2*(2*n-7)*(4*n-15)*(4*n-13)*a[n-5]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A121631 Finite sum involving signless Stirling numbers of the first kind and the Bell numbers. Appears in the process of normal ordering of n-th power of (a)^4*(a+*a), where a+ and a are boson creation and annihilation operators, respectively.
 * @author Georg Fischer
 */
public class A121631 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A121631() {
    super(0, "[[0],[698880,-950528,516256,-139968,18944,-1024],[139079,-170816,79120,-16384,1280],[13350,-14276,5184,-640],[811,-704,160],[34,-20],[1]]", "[1,5,46,613,10679,229576,5868715]", 0);
  }
}

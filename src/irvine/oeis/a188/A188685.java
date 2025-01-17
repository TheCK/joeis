package irvine.oeis.a188;
// Generated by gen_seq4.pl holos [[0],[-3600,-9720,-9801,-4374,-729],[-3200,-9000,-9317,-4230,-713],[400,720,484,144,16]] [1,0,9,135] 2 at 2020-03-14 22:45
// Recurrence: 4*(2*n^2+9*n+10)^2*a[n+2]-(713*n^4+4230*n^3+9317*n^2+9000*n+3200)*a[n+1]-9*(9*n^2+27*n+20)^2*a[n+0]=0
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A188685 Partial alternating sums of binomial(3n,n)^2/(2n+1)^2.
 * @author Georg Fischer
 */
public class A188685 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A188685() {
    super(0, "[[0],[-3600,-9720,-9801,-4374,-729],[-3200,-9000,-9317,-4230,-713],[400,720,484,144,16]]", "[1,0,9,135]", 2);
  }
}

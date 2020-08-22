package irvine.oeis.a047;
// Generated by gen_seq4.pl holos [[0],[15482880,-143981568,529017984,-1048164768,1256216544,-953561592,461208816,-137650752,23083056,-1662120],[-3317760,32025216,-123294096,256280196,-321978468,255843831,-129267150,40169448,-6975342,515565],[172800,-1753440,7310720,-16577002,22650557,-19421015,10482534,-3441780,624221,-47595],[0,0,-20608,114944,-253954,292492,-191316,71424,-14122,1140]] [1,47,1306,31451] 0 at 2020-03-14 22:45
// Recurrence: 2*(n-1)*n^2*(2*n-1)*(285*n^5-3103*n^4+13059*n^3-26689*n^2+26560*n-10304)*a[n+0]=(n-1)*(47595*n^8-576626*n^7+2865154*n^6-7617380*n^5+11803635*n^4-10846922*n^3+5730080*n^2-1580640*n+172800)*a[n-1]-3*(3*n-5)*(3*n-4)*(19095*n^7-201061*n^6+842141*n^5-1814447*n^4+2160932*n^3-1410228*n^2+459104*n-55296)*a[n-2]+72*(3*n-8)*(3*n-7)*(3*n-5)*(3*n-4)*(285*n^5-1678*n^4+3497*n^3-3280*n^2+1372*n-192)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A047911 Number of sequences with n copies each of 1, 2, 3 and longest increasing subsequence of length 3.
 * @author Georg Fischer
 */
public class A047911 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A047911() {
    super(1, "[[0],[15482880,-143981568,529017984,-1048164768,1256216544,-953561592,461208816,-137650752,23083056,-1662120],[-3317760,32025216,-123294096,256280196,-321978468,255843831,-129267150,40169448,-6975342,515565],[172800,-1753440,7310720,-16577002,22650557,-19421015,10482534,-3441780,624221,-47595],[0,0,-20608,114944,-253954,292492,-191316,71424,-14122,1140]]", "[1,47,1306,31451]", 0);
  }
}

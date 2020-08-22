package irvine.oeis.a306;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1] [0,1,2,4,16,66,128,262,72,132,14,18,258,292,520,37,136,74,144,34,24,20,5,32,12,6,64,80,257,164,82,260,69,576,224] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A306979 a(1) = 0; a(n) is the sum of powers of 2 where the exponents are the digits of a(n-1).
 * @author Georg Fischer
 */
public class A306979 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306979() {
    super(1, "[0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", "[0,1,2,4,16,66,128,262,72,132,14,18,258,292,520,37,136,74,144,34,24,20,5,32,12,6,64,80,257,164,82,260,69,576,224]", 0);
  }
}

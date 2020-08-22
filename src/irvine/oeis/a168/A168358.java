package irvine.oeis.a168;
// Generated by gen_seq4.pl holos [[0],[-294912,1056768,-1273856,399360,398336,-401408,135168,-16384],[-384,2912,2560,-20160,18560,3328,-9984,3072],[120,44,-332,228,1076,448,-336,-192],[-24,-124,-222,-153,3,57,27,4]] [1,2,9,58] 0 at 2020-02-15 22:07
// Recurrence: (n+1)^2*(n+2)^3*(4*n^2-5*n-3)*a[n+0]=4*(n+1)^2*(48*n^5-12*n^4-136*n^3+15*n^2+49*n-30)*a[n-1]-32*(96*n^7-312*n^6+104*n^5+580*n^4-630*n^3+80*n^2+91*n-12)*a[n-2]+1024*(n-2)^3*(2*n-3)^2*(4*n^2+3*n-4)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A168358 Self-convolution square of A001246, which is the squares of Catalan numbers.
 * @author Georg Fischer
 */
public class A168358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A168358() {
    super(0, "[[0],[-294912,1056768,-1273856,399360,398336,-401408,135168,-16384],[-384,2912,2560,-20160,18560,3328,-9984,3072],[120,44,-332,228,1076,448,-336,-192],[-24,-124,-222,-153,3,57,27,4]]", "[1,2,9,58]", 0);
  }
}
